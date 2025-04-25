package com.ghartmann.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="MESA_TABLE")
public class Mesa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_mesa_sequence")
    @SequenceGenerator(name="id_mesa_sequence", sequenceName="mesa_seq")
    int id;

    @Column(name="numeroMesa", unique=true)
    int numero;

    @OneToMany(mappedBy="mesa")
    List<Pedido> pedidos = new ArrayList<>();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


}
