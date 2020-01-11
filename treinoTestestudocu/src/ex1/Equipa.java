package ex1;

import java.util.HashSet;
import java.util.Objects;

public class Equipa {
    private String nome;
    private String responsavel;
    private int golosMarcados;
    private int golosSofridos;
    private HashSet<Robo> robos;

    public Equipa(String nome, String responsavel, int golosMarcados, int golosSofridos) {
        this.nome = nome;
        this.responsavel = responsavel;
        this.golosMarcados = golosMarcados;
        this.golosSofridos = golosSofridos;
        this.robos = new HashSet<Robo>();
    }

    public String getNome() {
        return nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public int getGolosMarcados() {
        return golosMarcados;
    }

    public int getGolosSofridos() {
        return golosSofridos;
    }

    public boolean addRobo(Robo r){
        return robos.add(r);
    }

    public boolean removeRobo(Robo r){
        return robos.remove(r);
    }

    public boolean containsRobo(Robo r){
        return robos.contains(r);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipa equipa = (Equipa) o;
        return golosMarcados == equipa.golosMarcados &&
                golosSofridos == equipa.golosSofridos &&
                nome.equals(equipa.nome) &&
                responsavel.equals(equipa.responsavel) &&
                robos.equals(equipa.robos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, responsavel, golosMarcados, golosSofridos, robos);
    }

    @Override
    public String toString() {
        return "Equipa{" +
                "nome='" + nome + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", golosMarcados=" + golosMarcados +
                ", golosSofridos=" + golosSofridos +
                ", robos=" + robos +
                '}';
    }
}
