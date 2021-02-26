package com.example.demo.com.examples.demo.entities;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Contact implements Serializable {

    private Long id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String email;
    private Long tel;
    private String photo;

    public Contact() {
        super();
    }

    public Contact(String nom, String prenom, Date dateNaissance, String email, Long tel, String photo) {
       super();
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.tel = tel;
        this.photo = photo;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public Long getTel() {
        return tel;
    }

    public String getPhoto() {
        return photo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

}
