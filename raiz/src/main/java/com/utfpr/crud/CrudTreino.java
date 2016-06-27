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
 * @author Heydi
 */

public class CrudTreino {

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
     public void remove(com.utfpr.entidades.Treino treino) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            com.utfpr.entidades.Treino trei;
            trei=em.find(com.utfpr.entidades.Treino.class, treino.getId());
            em.remove(trei);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
      public void update(com.utfpr.entidades.Treino treino) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            com.utfpr.entidades.Treino trei;
            trei=em.find(com.utfpr.entidades.Treino.class, treino.getId());
            trei.setExercicio1(treino.getExercicio1());
            trei.setExercicio2(treino.getExercicio2());
            trei.setExercicio3(treino.getExercicio3());
            trei.setExercicio4(treino.getExercicio4());
            trei.setExercicio5(treino.getExercicio5());
            trei.setExercicio6(treino.getExercicio6());
            trei.setRepeticao1(treino.getRepeticao1());
            trei.setRepeticao2(treino.getRepeticao2());
            trei.setRepeticao3(treino.getRepeticao3());
            trei.setRepeticao4(treino.getRepeticao4());
            trei.setRepeticao5(treino.getRepeticao5());
            trei.setRepeticao6(treino.getRepeticao6());
            trei.setTipo(treino.getTipo());
            em.merge(trei);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    public java.util.Collection<com.utfpr.entidades.Treino> getAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("Treino.findAll").getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            //em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
    }
    
    
}
