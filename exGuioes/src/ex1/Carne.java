package ex1;

import java.util.Objects;

public class Carne extends Alimento{
    private VariedadeCarne variedade;


    public Carne(VariedadeCarne variedade, double proteínas, double calorias, double peso) {
        super(proteínas, calorias, peso);
        this.variedade = variedade;
    }

    public VariedadeCarne getVariedade() {
        return variedade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Carne carne = (Carne) o;
        return variedade == carne.variedade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), variedade);
    }

    @Override
    public String toString() {
        return "Carne "  + variedade + super.toString();
    }
}
