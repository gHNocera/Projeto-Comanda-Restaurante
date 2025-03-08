package com.ghartmann;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Prato prato = new Prato();

    @Test
    public void shouldAddDish(){
        prato.add("foto.png", "Carne", "Carne com batata");
    }
}