package com.ghartmann;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    IPratoDAO pratoDao = new PratoDAO();
    IMesaDAO mesaDao = new MesaDAO();

    @Test
    public void shouldAddDishAndTable(){
        Prato prato1 = pratoDao.add("foto.png", "Carne", "Carne com batata", 1);
        Prato prato2 = pratoDao.add("foto.png", "Batata Frita", "Batata Frita, com sal", 2);
        mesaDao.add(1, {prato1, prato2});
    }

    @Test
    public void shouldGetDish(){
        
    }
}