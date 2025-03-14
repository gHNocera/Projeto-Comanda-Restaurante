/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ghartmann;

import java.util.List;


public class MesaDAO implements IMesaDAO{

    Mesa mesa = new Mesa();

    @Override
    public Boolean add(int numero, List<Prato> pratos) {
        mesa.setNumero(numero);
        mesa.setPratosList(pratos);
        return true;
    }

    @Override
    public Mesa get(int numero) {
        mesa.getPratosList();
        return mesa;
    }

}
