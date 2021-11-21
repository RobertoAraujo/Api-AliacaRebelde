package com.poshyweb.dto;

import com.poshyweb.model.Localizacao;
import com.poshyweb.model.Rebelde;

import javax.persistence.*;
import java.util.Objects;

public class DtoLocalizacao {

    private Long id;
    private String nome;
    private int latitude;
    private int longitude;

    public DtoLocalizacao() {
        super();
    }

    public DtoLocalizacao(Long id, String nome, int latitude, int longitude) {
        super();
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
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

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Localizacao)) return false;
        Localizacao that = (Localizacao) o;
        return getLatitude() == that.getLatitude() && getLongitude() == that.getLongitude() && getId().equals(that.getId()) && getNome().equals(that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getLatitude(), getLongitude());
    }

    @Override
    public String toString() {
        return "Localizacao{" + "id=" + id + ", nome='" + nome + '\'' +
                ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }
}
