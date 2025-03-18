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

    @Test
    public void shouldAddDishAndTable(){

        listaPratos.add(prato1); listaPratos.add(prato2);
        mesaDao.add(1, listaPratos);
    }

    @Test
    public void shouldGetDish(){
        mesaDao.get(1);
    }

    public void criarPrato(){
        Prato prato1 = new Prato("foto", "Strogonoff", "Strogonoff de carne com batata palha", 1);
        Prato prato2 = new Prato("foto", "", null, 0);
    }
}