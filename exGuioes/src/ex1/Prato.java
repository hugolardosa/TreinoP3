package ex1;

import java.util.ArrayList;
import java.util.Objects;

public class Prato {
    private String nome;
    private ArrayList<Alimento> alimentos;

    public Prato(String nome) {
        this.nome = nome;
        alimentos = new ArrayList<>();
    }

    public boolean addIngrediente(Alimento a){
        return alimentos.add(a);
    }

    public boolean removeIngrediente(Alimento a){
        return alimentos.remove(a);
    }

    public boolean containsIngrediente(Alimento a){
        return alimentos.contains(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prato prato = (Prato) o;
        return nome.equals(prato.nome) &&
                alimentos.equals(prato.alimentos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, alimentos);
    }

    @Override
    public String toString() {
        return "Prato " + nome +
                ", alimentos=" + alimentos ;
    }
}
