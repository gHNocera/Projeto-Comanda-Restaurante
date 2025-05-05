package com.ghartmann;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.ghartmann.dao.IPratoDAO;
import com.ghartmann.dao.PratoDAO;
import com.ghartmann.domain.Mesa;
import com.ghartmann.domain.Prato;



/**
 * Unit test for simple App.
 *
 */
public class AppTest{

    IPratoDAO pratoDao = new PratoDAO();

    @Test
    public void shouldAddDish(){
        Prato prato1 = new Prato("foto", "Strogonoff", "Strogonoff de carne com batata palha");
        pratoDao.adicionarPrato(prato1);
        Prato pratoBD = pratoDao.consultarPrato(prato1); 
        assertNotNull(pratoBD);
        pratoDao.excluirPrato(prato1);
        Prato pratoBD1 = pratoDao.consultarPrato(prato1);
        assertNotNull(pratoBD1);
    }

    @Test
    public void alterDish(){ 
        Prato prato1 = new Prato("foto", "Strogonoff", "Strogonoff de carne com batata palha");
        pratoDao.adicionarPrato(prato1);
        prato1.setNomePrato("Strogonoff de frango");
        prato1.setDescricao("Strogonoff de frango com batata palha");
        pratoDao.alterarPrato(prato1);
        pratoDao.excluirPrato(prato1);
    }

    @Test
    public void allDish(){
        Prato prato1 = new Prato("foto.png", "Mignon Alfredo", "Filé Mignon com macarrão ao molho alfredo");
        Prato prato2 = new Prato("foto.png", "Strogonoff", "Strogonoff de carne com batata palha");
        pratoDao.adicionarPrato(prato1);
        pratoDao.adicionarPrato(prato2);
        List<Prato> pratosBD =new ArrayList<>();
        pratosBD = pratoDao.retornarTodos();
        for (Prato p : pratosBD) {
            System.out.println(p);
        }

    }

    @Test
    public void deleteAllDish(){
        List<Prato> pratosBD =new ArrayList<>();
        pratosBD = pratoDao.retornarTodos();
        for (Prato p : pratosBD) {
            pratoDao.excluirPrato(p);
        }

    }

    @Test
    public void addMesa(){
        Mesa mesa = new Mesa();
    }

}