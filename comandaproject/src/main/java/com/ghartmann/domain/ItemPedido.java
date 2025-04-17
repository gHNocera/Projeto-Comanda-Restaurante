package com.ghartmann.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ITEMPEDIDO_TABLE")
public class ItemPedido {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_pratomesa_sequence")
    @SequenceGenerator(name="id_pratomesa_sequence", sequenceName="pratomesa_seq")
    int id;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "prato_id")
    private Prato prato;

    @ManyToOne
    @JoinColumn(name="mesa_id")
    private Mesa mesa;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }


}
