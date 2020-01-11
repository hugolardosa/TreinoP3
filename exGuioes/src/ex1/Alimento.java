package ex1;

import java.util.Objects;

public abstract class Alimento {
    private double proteínas;
    private double calorias;
    private double peso;

    public Alimento(double proteínas, double calorias, double peso) {
        this.proteínas = proteínas;
        this.calorias = calorias;
        this.peso = peso;
    }

    public double getProteínas() {
        return proteínas;
    }

    public double getCalorias() {
        return calorias;
    }

    public double getPeso() {
        return peso;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alimento alimento = (Alimento) o;
        return Double.compare(alimento.proteínas, proteínas) == 0 &&
                Double.compare(alimento.calorias, calorias) == 0 &&
                Double.compare(alimento.peso, peso) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(proteínas, calorias, peso);
    }

    @Override
    public String toString() {
        return  "proteínas=" + proteínas +
                ", calorias=" + calorias +
                ", peso=" + peso;
    }
}
