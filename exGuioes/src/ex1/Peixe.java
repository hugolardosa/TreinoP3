package ex1;

import java.util.Objects;

public class Peixe extends Alimento{
    private TipoPeixe tipo;

    public Peixe(TipoPeixe tipo, double proteínas, double calorias, double peso) {
        super(proteínas,calorias,peso);
        this.tipo = tipo;
    }


    public TipoPeixe getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Peixe peixe = (Peixe) o;
        return tipo == peixe.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        return "Peixe " + tipo + super.toString();
    }
}
