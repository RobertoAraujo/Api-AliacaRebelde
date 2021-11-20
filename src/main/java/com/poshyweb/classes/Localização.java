package com.poshyweb.classes;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "localizacao")
public class Localização implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "latitude")
    private int latitude;
    @Column(name = "logitude")
    private int longitude;

    public Localização() {

    }

    public Localização(int id, String nome, int latitude, int longitude) {
        this.id = id;
        this.nome = nome;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Localização that = (Localização) o;
        return id == that.id && latitude == that.latitude && longitude == that.longitude && Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, latitude, longitude);
    }

    @Override
    public String toString() {
        return "Localização{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
