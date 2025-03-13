/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ghartmann;


public class PratoDAO implements IPratoDAO{
    Prato prato = new Prato();

    @Override
    public Prato add(String foto, String nome, String descricao, int mesa) {
        prato.setFoto(foto);
        prato.setNomePrato(nome);
        prato.setDescricao(descricao);
        prato.setNumeroMesa(mesa);
        return prato;
    }
}
