package com.ghartmann.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PEDIDOS_TABLE")
public class Pedido {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_pedido_sequence")
    @SequenceGenerator(name="id_pedido_sequence", sequenceName="pedido_seq")
    private Long id;

    @Column(name="Observações")
    String observação;

    @ManyToOne
    @JoinColumn(name="mesa_id")
    private Mesa mesa;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<Prato> pratosPedidos = new ArrayList<>();

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }

    public List<Prato> getPratosPedidos() {
        return pratosPedidos;
    }

    public void setPratosPedidos(List<Prato> pratosPedidos) {
        this.pratosPedidos = pratosPedidos;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
