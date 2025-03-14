package com.ghartmann;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="PRATO_TABLE")
class Prato {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_prato_sequence")
    @SequenceGenerator(name="id_prato_sequence", sequenceName="prato_seq")
    int id;

    @Column(name="fotoPrato")
    String foto;

    @Column(name="nomePrato")
    String nomePrato;

    @Column(name="descPrato")
    String descricao;

    @Column(name="obs")
    String observacao;

    @Column(name="numeroMesa")
    int numeroMesa;

    //*Um prato para muitas mesas */
    @ManyToOne
    @JoinColumn(name="mesa_id")
    Mesa mesa;

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }


    

}
