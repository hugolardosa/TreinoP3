package ex1;

import java.util.ArrayList;
import java.util.Objects;

public class PratoVegetariano extends Prato{
    private ArrayList<AlimentoVegetariano> alimento;

    public PratoVegetariano(String nome) {
        super(nome);
        this.alimento = new ArrayList<>();
    }


    public boolean addIngrediente(AlimentoVegetariano a){
        return alimento.add(a);
    }

    public boolean removeIngrediente(AlimentoVegetariano a){
        return alimento.remove(a);
    }

    public boolean containsIngrediente(AlimentoVegetariano a){
        return alimento.contains(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PratoVegetariano that = (PratoVegetariano) o;
        return alimento.equals(that.alimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alimento);
    }

    @Override
    public String toString() {
        return "PratoVegetariano{" +
                ", alimento=" + alimento +
                super.toString();
    }
}
