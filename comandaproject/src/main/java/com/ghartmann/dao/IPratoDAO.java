/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.ghartmann.dao;

import java.util.List;

import com.ghartmann.domain.Prato;


public interface IPratoDAO {

    public boolean adicionarPrato(Prato prato);

    public void excluirPrato(Prato prato);

    public void alterarPrato(Prato prato);

    public Prato consultarPrato(Prato prato);

    public List<Prato> retornarTodos();

}
