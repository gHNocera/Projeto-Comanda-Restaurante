/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ghartmann.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.ghartmann.JPAUtil;
import com.ghartmann.domain.Prato;



public class PratoDAO implements IPratoDAO{

    //*Adiciona o prato ao banco de dados */

    @Override
    public boolean adicionarPrato(Prato prato) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(prato);

            transaction.commit();
            
            return true;
        } catch (Exception e) {
            if(transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao adicionar prato", e);
        } finally{
            entityManager.close();
        }
    }

    @Override
    public void excluirPrato(Prato prato) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction transaction = null;
        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            Prato pratoBD = entityManager.find(Prato.class, prato.getId());
            if (pratoBD != null) {
                entityManager.remove(pratoBD);
            }

            transaction.commit();
        } catch (Exception e) {
            if(transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            throw new RuntimeException("Erro as excluir prato", e);
        }finally{
            entityManager.close();
        }
    }

    @Override
    public void alterarPrato(Prato prato) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.merge(prato);

            transaction.commit();
        } catch (Exception e) {
            if(transaction != null && transaction.isActive()){
                transaction.rollback();
            }
            throw new RuntimeException("Erro ao alterar prato", e);
        }finally {
            entityManager.close();
        }
    }

    @Override
    public Prato consultarPrato(Prato prato) {
        EntityManager entityManager = JPAUtil.getEntityManager();
        Prato pratoBD = null;
        try {
            pratoBD = entityManager.find(Prato.class, prato.getId());
            if(pratoBD == null){
                return prato;
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao consultar prato", e);
        } finally{
            entityManager.close();
        }
        return pratoBD;
    }

    @Override
    public List<Prato> retornarTodos() {
        EntityManager entityManager = JPAUtil.getEntityManager();
        List<Prato> pratosBD = new ArrayList<>();
        try {
            pratosBD = entityManager.createQuery("SELECT p FROM Prato p", Prato.class).getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar os pratos", e);
        }finally{
            entityManager.close();
        }
        return pratosBD;
    }
}
