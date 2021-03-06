/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.crud;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author Marcele
 */
public class CrudDieta {
    
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
    public void remove(com.utfpr.entidades.Alimentos alimento) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            com.utfpr.entidades.Alimentos alim;
            alim=em.find(com.utfpr.entidades.Alimentos.class, alimento.getId());
            em.remove(alim);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
      public void update(com.utfpr.entidades.Alimentos alimento) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            com.utfpr.entidades.Alimentos alim;
            alim=em.find(com.utfpr.entidades.Alimentos.class, alimento.getId());
            alim.setNome1(alimento.getNome1());
            alim.setNome2(alimento.getNome2());
            alim.setNome3(alimento.getNome3());
            alim.setNome4(alimento.getNome4());
            alim.setNome5(alimento.getNome5());
            alim.setNome6(alimento.getNome6());
            alim.setTipo(alimento.getTipo());
            em.merge(alim);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public java.util.Collection<com.utfpr.entidades.Alimentos> getAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("Alimentos.findAll").getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            //em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
    }
    
}
