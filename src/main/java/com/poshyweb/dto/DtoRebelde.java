package com.poshyweb.dto;

import com.poshyweb.model.Rebelde;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class DtoRebelde implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private int idade;
    private String genero;

    public DtoRebelde() {
        super();
    }

    public DtoRebelde(Rebelde objRebelde) {
        super();
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rebelde)) return false;
        Rebelde rebelde = (Rebelde) o;
        return getIdade() == rebelde.getIdade() && getId().equals(rebelde.getId()) && getNome().equals(rebelde.getNome()) && getGenero().equals(rebelde.getGenero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getIdade(), getGenero());
    }

    @Override
    public String toString() {
        return "Rebelde{" + "id=" + id + ", nome='" + nome + '\'' +
                ", idade=" + idade + ", genero='" + genero + '\'' + '}';
    }
}
