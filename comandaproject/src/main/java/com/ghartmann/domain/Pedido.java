package com.ghartmann.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_pedido_sequence")
    @SequenceGenerator(name="id_pedido_sequence", sequenceName="pedido_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name="mesa_id")
    private Mesa mesa;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemPedido> itens = new ArrayList<>();


}
