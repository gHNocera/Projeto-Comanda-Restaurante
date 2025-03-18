package com.ghartmann;

import java.util.List;
import javax.persistence.*;



@Entity
@Table(name="MESA_TABLE")
public class Mesa {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_prato_sequence")
    @SequenceGenerator(name="id_prato_sequence", sequenceName="prato_seq")
    int id;

    @Column(name="numeroMesa", unique=true)
    int numero;

    //*Uma mesa para muito pratos */
    @OneToMany(mappedBy="mesa")
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

    public int getId() {
        return id;
    }

}
