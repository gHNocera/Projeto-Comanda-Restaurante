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
        Prato prato1 = pratoDao.add("foto.png", "Carne", "Carne com batata", 1);
        Prato prato2 = pratoDao.add("foto.png", "Batata Frita", "Batata Frita, com sal", 2);
        listaPratos.add(prato1); listaPratos.add(prato2);
        mesaDao.add(1, listaPratos);
    }

    @Test
    public void shouldGetDish(){
        mesaDao.get(1);
    }
}