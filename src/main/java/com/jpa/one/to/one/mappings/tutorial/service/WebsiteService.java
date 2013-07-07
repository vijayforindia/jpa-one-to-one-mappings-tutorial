package com.jpa.one.to.one.mappings.tutorial.service;

import com.jpa.one.to.one.mappings.tutorial.domain.Website;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class WebsiteService {

    private EntityManager em;

    public WebsiteService(EntityManager em) {
        this.em = em;
    }

    public Website createWebsite(int id, String url) {
        Website artist = new Website(id, url);
        em.persist(artist);

        return artist;
    }

    public void removeWebsite(int id) {
        Website website = em.find(Website.class, id);

        if (website != null) {
            em.remove(website);
        }
    }

    public Website changeWebsiteUrl(int id, String url) {
        Website website = em.find(Website.class, id);

        if (website != null) {
            website.setUrl(url);
        }

        return website;
    }

    public Website findWebsite(int id) {
        return em.find(Website.class, id);
    }

    public List<Website> findAllWebsites() {
        TypedQuery<Website> query = em.createQuery("SELECT w FROM Website w", Website.class);
        return query.getResultList();
    }
}
