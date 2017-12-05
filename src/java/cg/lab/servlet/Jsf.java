/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cg.lab.servlet;

import cg.lab.beans.Message;
import cg.lab.beans.SessionBean;
import cg.lab.beans.UserBean;
import cg.lab.model.Utilisateur;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HP Notebook
 */
@WebServlet(value = {"/", "/index", "/register", "/profil"})
public class Jsf extends HttpServlet {

    private final static String BASE_CONTENT = "/WEB-INF/jsp";
    private final static String context = "/LabCdi";

    private Utilisateur utilisateur;
    @Inject
    private SessionBean bean;
    @Inject
    private UserBean bean1;
    @Inject
    private Message message;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();

        if (uri.equalsIgnoreCase(context)) {
            this.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        } else if (uri.equalsIgnoreCase(context + "/index")) {

            this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/index.jsp").forward(req, resp);
        } else if (uri.equalsIgnoreCase(context + "/register")) {
            this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/register.jsp").forward(req, resp);
        } else if (uri.equalsIgnoreCase(context + "/profil")) {
            this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/profil.jsp").forward(req, resp);
        } else if (uri.equalsIgnoreCase(context + "/login")) {
            this.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/404.jsp").forward(req, resp);

        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        utilisateur = new Utilisateur();

        if (uri.equalsIgnoreCase(context + "/login")) {
            utilisateur.setLogin(req.getParameter("login"));
            utilisateur.setPass(req.getParameter("pass"));
            Utilisateur u = bean1.connectUser(utilisateur);

            if (u != null) {
                bean.addSessionUser(u);

                this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/index.jsp").forward(req, resp);

            } else {
                
                message.setMessage("Login ou Mot de Passe Incorrect");
                this.getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);

            }
        } else if (uri.equalsIgnoreCase(context + "/register")) {
            utilisateur.setNom(req.getParameter("nom"));
            utilisateur.setPrenom(req.getParameter("prenom"));
            utilisateur.setAge(Integer.parseInt(req.getParameter("age")));
            utilisateur.setLogin(req.getParameter("login"));
            utilisateur.setPass(req.getParameter("pass"));
            message.setMessage("Inscription ok");
            bean1.addUser(utilisateur);

            this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/register.jsp").forward(req, resp);
        } else {

            this.getServletContext().getRequestDispatcher(BASE_CONTENT + "/404.jsp").forward(req, resp);

        }

    }

}
