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
    public void shouldAddDishAndTable(){
        pratoDao.add("foto.png", "Carne", "Carne com batata", 1);
        mesaDao.add(1);
    }

    @Test
    public void shouldGetDish(){
        
    }
}