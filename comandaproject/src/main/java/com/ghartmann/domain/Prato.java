package com.ghartmann.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PRATO_TABLE")
public
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

    public Prato(String foto, String nomePrato, String descricao){
        this.foto = foto;
        this.nomePrato = nomePrato;
        this.descricao = descricao;
    }

    public Prato(){}

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

    public int getId() {
        return id;
    }

    

}
