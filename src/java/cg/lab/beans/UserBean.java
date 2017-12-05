/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cg.lab.beans;

import cg.lab.model.Utilisateur;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author HP Notebook
 */
@Named(value = "user")
@ApplicationScoped
public class UserBean {

    private HashMap<Integer, Utilisateur> users;

    private boolean test;

    public UserBean() {
        users = new HashMap<>();

    }

    public void addUser(Utilisateur user) {
        users.put(users.size() + 1, user);
    }

    public void deleteUser(Utilisateur user) {
        users.remove(user.getId(), user);
    }

    public List allUsers() {

        List<Utilisateur> listUser = new ArrayList<>();
        for (Map.Entry<Integer, Utilisateur> entry : users.entrySet()) {
            Utilisateur value = entry.getValue();

            listUser.add(value);
        }
        
        return listUser;
    }

    public Utilisateur connectUser(Utilisateur utilisateur) {
        Utilisateur u=new Utilisateur();
        for (Map.Entry<Integer, Utilisateur> entry : users.entrySet()) {
            Utilisateur value = entry.getValue();
            if (utilisateur.getLogin().equalsIgnoreCase(value.getLogin()) && utilisateur.getPass().equalsIgnoreCase(value.getPass())) {
               u=value;
            } 

        }
        return u;

        
    }

}
