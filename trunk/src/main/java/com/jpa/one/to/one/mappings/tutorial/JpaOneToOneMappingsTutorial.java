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

        System.out.println("--- Find website ---");
        Website website = websiteService.findWebsite(1);
        System.out.println(String.format("Found website: %s", website));
        System.out.println(String.format("Website artist: %s\n", website.getArtist()));

        System.out.println("--- Find artist ---");
        Artist artist = artistService.findArtist(1);
        System.out.println(String.format("Found artist: %s", artist));
        System.out.println(String.format("Artist website: %s\n", artist.getWebsite()));
    }
}