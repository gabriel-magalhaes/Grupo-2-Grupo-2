package com.utfpr.crud;

import com.utfpr.entidades.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by laisa on 26/06/2016.
 */
public class CrudCliente {
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

    public java.util.Collection<Cliente> getAll() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createNamedQuery("Cliente.findAll").getResultList();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            //em.getTransaction().rollback();
            return null;
        } finally {
            em.close();
        }
    }

    public Cliente get(String email){
        EntityManager em = emf.createEntityManager();
        return em.find(Cliente.class, email);
    }

    public Cliente atualizar(Cliente cliente, String emailOriginal){
        EntityManager em = emf.createEntityManager();
        Cliente clienteOriginal = em.find(Cliente.class, emailOriginal);
        em.getTransaction().begin();
        clienteOriginal.setEmail(cliente.getEmail());
        clienteOriginal.setNome(cliente.getNome());
        clienteOriginal.setSenha(cliente.getSenha());
        clienteOriginal.setAltura(cliente.getAltura());
        clienteOriginal.setPeso(cliente.getPeso());
        clienteOriginal.setSexo(cliente.getSexo());
        clienteOriginal.setTelefone(cliente.getTelefone());
        clienteOriginal.setCelular(cliente.getCelular());
        clienteOriginal.setNascimentoPersonal(cliente.getNascimentoPersonal());
        clienteOriginal.setNascimento(cliente.getNascimento());
        clienteOriginal.setBasal(cliente.getBasal());
        clienteOriginal.setImc(cliente.getImc());
        clienteOriginal.setPercentual(cliente.getPercentual());
        em.getTransaction().commit();
        return cliente;
    }

    public Cliente validarCliente(String email,String senha)
    {
        EntityManager em = emf.createEntityManager();
        Cliente cliente =  em.find(Cliente.class, email);
        if(cliente == null){
            return null;
        }
        if(cliente.getSenha().equals(senha)){
            return cliente;
        } else {
            return null;
        }
    }

    public void excluir(String email) {
        EntityManager em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, email);
        em.getTransaction().begin();
        em.remove(cliente);
        em.getTransaction().commit();
    }
}
