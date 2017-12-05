/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cg.lab.model;

import java.io.Serializable;

/**
 *
 * @author HP Notebook
 */
public class Utilisateur implements Serializable{
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String login;
    private String pass;

    public Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, int age, String login, String pass) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.login = login;
        this.pass = pass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return nom; 
    }
    
    
}
