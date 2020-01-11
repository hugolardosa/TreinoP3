package ex1;

import java.util.Objects;

public class Jogo {
    private Bola bola;
    private GameTime Total;
    private GameTime decorrido;

    public Jogo(Bola bola, GameTime total, GameTime decorrido) {
        this.bola = bola;
        Total = total;
        this.decorrido = decorrido;
    }

    public Bola getBola() {
        return bola;
    }

    public GameTime getTotal() {
        return Total;
    }

    public GameTime getDecorrido() {
        return decorrido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogo jogo = (Jogo) o;
        return bola.equals(jogo.bola) &&
                Total.equals(jogo.Total) &&
                decorrido.equals(jogo.decorrido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bola, Total, decorrido);
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "bola=" + bola +
                ", Total=" + Total +
                ", decorrido=" + decorrido +
                '}';
    }

    /*
    * This exercise is missing a test class
    * will work on it later
    */

}
