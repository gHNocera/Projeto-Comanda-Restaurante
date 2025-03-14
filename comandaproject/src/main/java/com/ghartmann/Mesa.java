package com.ghartmann;

import java.util.List;

public class Mesa {

    int id;

    int numero;

    List<Prato> pratosList;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Prato> getPratosList() {
        return pratosList;
    }

    public void setPratosList(List<Prato> pratosList) {
        this.pratosList = pratosList;
    }


}
