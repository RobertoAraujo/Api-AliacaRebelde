package com.poshyweb.model;

import java.util.Objects;
import java.util.UUID;

public class Produto {
    private UUID id;
    private String nome;
    private int quantidade;

    public Produto() {

    }

    public Produto(UUID id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return getQuantidade() == produto.getQuantidade() && getId().equals(produto.getId()) && getNome().equals(produto.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getQuantidade());
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade + '}';
    }
}
