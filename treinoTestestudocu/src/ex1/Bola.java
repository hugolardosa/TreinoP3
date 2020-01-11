package ex1;

import java.util.Objects;

public class Bola extends ObjetoMovel {
    private Cor cor;

    public Bola(int x, int y, double velocidade, Cor cor) {
        super(x, y, velocidade);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bola bola = (Bola) o;
        return cor == bola.cor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cor);
    }

    @Override
    public String toString() {
        return "Bola " + cor + " com " + super.toString();
    }
}
