package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private Date creation;
    private String content;
    private String author; // Nouveau champ pour l'auteur

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() { // Getter pour l'auteur
        return author;
    }

    public void setAuthor(String author) { // Setter pour l'auteur
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


