/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.ghartmann;

import java.util.List;


interface IMesaDAO {

    public Boolean add(int numero, List<Prato> pratos);

    public Mesa get(int numero);

}
