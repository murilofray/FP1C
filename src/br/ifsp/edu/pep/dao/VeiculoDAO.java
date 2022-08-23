/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifsp.edu.pep.dao;

import br.edu.ifsp.pep.modelo.Veiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author aluno
 */
public class VeiculoDAO {
    private EntityManagerFactory emf;
    
    public VeiculoDAO()
    {
        emf = Persistence.createEntityManagerFactory("aula1PU");
    }
    
    private EntityManager getEntityManager()
    {
        return this.emf.createEntityManager();
    }
    
    public void inserir(Veiculo veiculo)
    {
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.persist(veiculo);
        em.getTransaction().commit();
        
        em.close();
    }
    
    public void alterar(Veiculo veiculo)
    {
        EntityManager em = getEntityManager();
        
        em.getTransaction().begin();
        em.merge(veiculo);
        em.getTransaction().commit();
        
        em.close();
    }
}
