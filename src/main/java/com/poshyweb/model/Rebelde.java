package com.poshyweb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "rebelde")
public class Rebelde implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;
    @Column( name = "nome")
    private String nome;
    @Column(name = "idade")
    private int idade;
    @Column(name = "genero")
    private char genero;

    public Rebelde() {
    }

    public Rebelde(UUID id, String nome, int idade, char genero) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rebelde)) return false;
        Rebelde rebelde = (Rebelde) o;
        return getIdade() == rebelde.getIdade() && getGenero() == rebelde.getGenero() && getId().equals(rebelde.getId()) && getNome().equals(rebelde.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getIdade(), getGenero());
    }

    @Override
    public String toString() {
        return "Rebelde{" + "id=" + id + ", nome='" + nome + '\'' + ", idade=" + idade +
                ", genero=" + genero + '}';
    }
}
