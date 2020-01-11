package ex1;

import java.util.Objects;

public class Robo extends ObjetoMovel {
    private String id;
    private TipodeJogador tipo;
    private int numerodegolos;

    public Robo(int x, int y, double velocidade, String id, TipodeJogador tipo, int numerodegolos) {
        super(x, y, velocidade);
        this.id = id;
        this.tipo = tipo;
        this.numerodegolos = numerodegolos;
    }

    public String getId() {
        return id;
    }

    public TipodeJogador getTipo() {
        return tipo;
    }

    public int getNumerodegolos() {
        return numerodegolos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Robo robo = (Robo) o;
        return numerodegolos == robo.numerodegolos &&
                Objects.equals(id, robo.id) &&
                tipo == robo.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, tipo, numerodegolos);
    }

    @Override
    public String toString() {
        return "Robo: " + id +" "+ tipo +
                " Golos Marcados" + numerodegolos +
                " info: " + super.toString();
    }
}
