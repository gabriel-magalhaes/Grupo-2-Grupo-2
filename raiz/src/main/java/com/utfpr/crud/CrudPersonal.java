/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.crud;

import com.utfpr.entidades.Personal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tamires
 */
public class CrudPersonal {
     EntityManagerFactory emf = Persistence.createEntityManagerFactory("max_move_unit");

    public void persist(Object object) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

    public java.util.Collection<Personal> getAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("Personal.findAll").getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            //em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
    }

    public Personal get(String email){
        EntityManager em = emf.createEntityManager();
        return em.find(Personal.class, email);
    }

    public Personal atualizar(Personal personal, String emailOriginal){
        EntityManager em = emf.createEntityManager();
        Personal personalOriginal = em.find(Personal.class, emailOriginal);
        em.getTransaction().begin();
        personalOriginal.setEmail(personal.getEmail());
        personalOriginal.setNome(personal.getNome());
        personalOriginal.setSenha(personal.getSenha());
        personalOriginal.setSexo(personal.getSexo());
        personalOriginal.setTelefone(personal.getTelefone());
        personalOriginal.setCelular(personal.getCelular());
        personalOriginal.setNascimento(personal.getNascimento());
        em.getTransaction().commit();
        return personal;
    }

    public Personal validarPersonal(String email,String senha)
    {
        EntityManager em = emf.createEntityManager();
        Personal personal =  em.find(Personal.class, email);
        System.out.println("(email="+email+"), (senha="+senha+"), (personal.email="+personal.email+"), (personal.senha="+personal.senha);
        if(personal == null){
            return null;
        }
        if(personal.getSenha().equals(senha)){
            return personal;
        } else {
            return null;
        }
    }

    public void excluir(String email) {
        EntityManager em = emf.createEntityManager();
        Personal personal = em.find(Personal.class, email);
        em.getTransaction().begin();
        em.remove(personal);
        em.getTransaction().commit();
    }
}
