package org.example;

import java.util.Objects;

public class Contatto {



    private int id;
    private String nome;
    private String cognome;

    public Contatto(int id, String nome, String cognome) {
        this.id=id;
        this.nome = nome;
        this.cognome=cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;


    }

    @Override
    public String toString() {
        return "Contatto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contatto)) return false;
        Contatto contatto = (Contatto) o;
        return id == contatto.id && Objects.equals(nome, contatto.nome) && Objects.equals(cognome, contatto.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cognome);
    }
}
