package com.jpa.one.to.one.mappings.tutorial;

import com.jpa.one.to.one.mappings.tutorial.domain.Artist;
import com.jpa.one.to.one.mappings.tutorial.domain.Website;
import com.jpa.one.to.one.mappings.tutorial.service.ArtistService;
import com.jpa.one.to.one.mappings.tutorial.service.WebsiteService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaOneToOneMappingsTutorial {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaOneToOneMappingsTutorial");
        EntityManager em = emf.createEntityManager();
        ArtistService artistService = new ArtistService(em);
        WebsiteService websiteService = new WebsiteService(em);

        Website website = websiteService.findWebsite(1);
        Artist artist = artistService.findArtist(1);
    }
}
