package com.poshyweb.model;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "localizacao")
public class Localizacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "latitude")
    private int latitude;
    @Column(name = "logitude")
    private int longitude;

    public Localizacao() {

    }

    public Localizacao(UUID id, String nome, int latitude, int longitude) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
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
        return "Localizacao{" + "id=" + id + ", nome='" + nome + '\'' + ", latitude=" + latitude +
                ", longitude=" + longitude + '}';
    }
}
