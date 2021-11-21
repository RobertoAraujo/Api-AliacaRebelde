package com.poshyweb.model;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;
@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "arma")
    private int arma;
    @Column(name = "municao")
    private int municao;
    @Column(name = "agua")
    private int agua;
    @Column(name = "comida")
    private int comida;

    @ManyToOne
    private Rebelde rebelde;

    public Inventario() {

    }

    public Inventario(Long id, int arma, int municao, int agua, int comida, Rebelde rebelde) {
        this.id = id;
        this.arma = arma;
        this.municao = municao;
        this.agua = agua;
        this.comida = comida;
        this.rebelde = rebelde;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    public int getMunicao() {
        return municao;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public Rebelde getRebelde() {
        return rebelde;
    }

    public void setRebelde(Rebelde rebelde) {
        this.rebelde = rebelde;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Inventario)) return false;
        Inventario that = (Inventario) o;
        return getArma() == that.getArma() && getMunicao() == that.getMunicao() && getAgua() == that.getAgua() && getComida() == that.getComida() && getId().equals(that.getId()) && getRebelde().equals(that.getRebelde());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getArma(), getMunicao(), getAgua(), getComida(), getRebelde());
    }

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", arma=" + arma + ", municao=" + municao +
                ", agua=" + agua + ", comida=" + comida + ", rebelde=" + rebelde + '}';
    }
}
