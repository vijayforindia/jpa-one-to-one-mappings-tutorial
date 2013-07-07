package com.jpa.one.to.one.mappings.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "websites")
public class Website {

    @Id
    @Column(name = "website_id")
    private int id;

    @Column(name = "website_url")
    private String url;

    @OneToOne
    @JoinColumn(name = "artist_id")
    Artist artist;

    public Website() {

    }

    public Website(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Website{" +
                "id=" + id +
                ", url='" + url + '\'' +
                '}';
    }
}
