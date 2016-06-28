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
    
    public void remove(com.utfpr.entidades.Personal profissional) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            com.utfpr.entidades.Personal prof;
            prof=em.find(com.utfpr.entidades.Personal.class, profissional.getId());
            em.remove(prof);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
    
      public void update(com.utfpr.entidades.Personal profissional) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            com.utfpr.entidades.Personal prof;
            prof=em.find(com.utfpr.entidades.Personal.class, profissional.getId());
            prof.setEspecialidade(profissional.getEspecialidade());
            prof.setPagina(profissional.getPagina());
            prof.setNome(profissional.getNome());
            prof.setEmail(profissional.getEmail());
            prof.setSexo(profissional.getSexo());
            prof.setTelefone(profissional.getTelefone());
            prof.setCelular(profissional.getCelular());
            prof.setNascimentoPersonal(profissional.getNascimentoPersonal());
            prof.setRua(profissional.getRua());
            prof.setNumero(profissional.getNumero());
            prof.setBairro(profissional.getBairro());
            prof.setCidade(profissional.getCidade());
            prof.setEstado(profissional.getEstado());
            prof.setCep(profissional.getCep());
            prof.setPais(profissional.getPais());
            prof.setComplemento(profissional.getComplemento());
            em.merge(prof);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
      
    public java.util.Collection<com.utfpr.entidades.Personal> getAll() {
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
}
