package com.ghartmann;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import com.ghartmann.dao.IPratoDAO;
import com.ghartmann.dao.PratoDAO;
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

}