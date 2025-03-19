/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ghartmann;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class PratoDAO implements IPratoDAO{

    //*Adiciona o prato ao banco de dados */

    @Override
    public Prato adicionarPrato(Prato prato) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(prato);

            transaction.commit();
            
            return prato;
        } catch (Exception e) {
            if(transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao adicionar prato", e);
        } finally{
            entityManager.close();
        }
    }
}
