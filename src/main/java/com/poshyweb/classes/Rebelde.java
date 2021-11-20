package com.poshyweb.classes;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "rebelde")
public class Rebelde implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;
    @Column( name = "nome")
    private String nome;
    @Column(name = "idade")
    private int idade;

    public Rebelde() {

    }

    public Rebelde(Long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rebelde rebelde = (Rebelde) o;
        return idade == rebelde.idade && Objects.equals(id, rebelde.id) && Objects.equals(nome, rebelde.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, idade);
    }

    @Override
    public String toString() {
        return "Rebelde{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
