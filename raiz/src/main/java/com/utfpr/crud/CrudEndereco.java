package com.utfpr.crud;

import com.utfpr.entidades.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by laisa on 26/06/2016.
 */
public class CrudEndereco {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("max_move_unit");

    public Endereco persist(Endereco endereco) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            em.getTransaction().rollback();
        } finally {
            em.close();
            return endereco;
        }
    }

    public Endereco atualizar(Endereco endereco){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(endereco);
        em.getTransaction().commit();
        return endereco;
    }

}
