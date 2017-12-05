/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cg.lab.beans;

import cg.lab.model.Utilisateur;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author HP Notebook
 */
@Named(value = "sessionUser")
@SessionScoped
public class SessionBean implements Serializable{
    private Utilisateur utilisateur;

    public SessionBean() {
        utilisateur=new Utilisateur();
    }
    
    public void addSessionUser(Utilisateur user){
       this.utilisateur=user;
    }  
    
    public void removeSessionUser(Utilisateur user){
        this.utilisateur=null;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
    
}
