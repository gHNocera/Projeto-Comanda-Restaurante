package com.ghartmann;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    IPratoDAO pratoDao = new PratoDAO();
    IMesaDAO mesaDao = new MesaDAO();
    List<Prato> listaPratos = new ArrayList<>();
    Prato prato1 = new Prato("foto", "Strogonoff", "Strogonoff de carne com batata palha", 1);
    Prato prato2 = new Prato("foto", "", null, 0);

    @Test
    public void shouldAddDish(){
        pratoDao.adicionarPrato(prato1);
    }

    @Test
    public void shouldAddTable(){
    }

}