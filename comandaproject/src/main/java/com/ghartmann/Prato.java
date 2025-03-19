package com.ghartmann;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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

    @Column(name="numeroMesa", unique=true)
    int numeroMesa;

    //*Um prato para muitas mesas */
    @ManyToOne
    @JoinColumn(name="fk_mesa_id", foreignKey= @ForeignKey(name="fk_mesa_prato"), referencedColumnName= "id")
    private Mesa mesa;

    public Prato(String foto, String nomePrato, String descricao, String obs, int numeroMesa){
        this.foto = foto;
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.observacao = obs;
        this.numeroMesa = numeroMesa;
    }

    public Prato(String foto, String nomePrato, String descricao, int numeroMesa){
        this(foto, nomePrato, descricao, "Sem Observação", numeroMesa);
    }


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

    public int getId() {
        return id;
    }

    public Mesa getMesa() {
        return mesa;
    }


    

}
