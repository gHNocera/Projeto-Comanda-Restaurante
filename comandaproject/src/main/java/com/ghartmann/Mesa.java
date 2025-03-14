package com.ghartmann;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;



@Entity
@Table(name="MESA_TABLE")
public class Mesa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_prato_sequence")
    @SequenceGenerator(name="id_prato_sequence", sequenceName="prato_seq")
    int id;

    @Column(name="numeroMesa")
    int numero;

    //*Uma mesa para muito pratos */
    @OneToMany
    @JoinColumn(name="mesa_id")
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
