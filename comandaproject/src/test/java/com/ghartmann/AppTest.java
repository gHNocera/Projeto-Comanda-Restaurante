package com.ghartmann;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    IPratoDAO pratoDao = new PratoDAO();
    IMesaDAO mesaDao = new MesaDAO();

    @Test
    public void shouldAddDish(){
        pratoDao.add("foto.png", "Carne", "Carne com batata");
        mesaDao.add(1);
    }
}