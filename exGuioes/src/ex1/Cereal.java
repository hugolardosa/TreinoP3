package ex1;

import java.util.Objects;

public class Cereal extends Alimento implements AlimentoVegetariano {
    private String tipo;

    public Cereal( String tipo,double proteínas, double calorias, double peso) {
        super(proteínas, calorias, peso);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cereal legume = (Cereal) o;
        return Objects.equals(tipo, legume.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tipo);
    }

    @Override
    public String toString() {
        return "Legume{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }
}
