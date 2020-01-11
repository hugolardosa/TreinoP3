package ex1;

import java.util.Objects;

public class ObjetoMovel {
    int x;
    int y;
    double velocidade;
    double distancia;

    public ObjetoMovel(int x, int y, double velocidade) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
    }

    /*
    * método privado para o calculo da distancia
    * percorrida
    */
    private double calcDistance(int x1, int y1, int x2, int y2){
      return Math.sqrt(((Math.pow(2,(x1-x2)))+(Math.pow(2,(y1-y2)))));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getDistancia() {
        return distancia;
    }

    public void move(int newX, int newY){
        distancia = calcDistance(x,newX, y, newY);
        x = newX;
        y = newY;
    }

    public void move(int newX, int newY, double velocidade){
        distancia = calcDistance(x,newX, y, newY);
        x = newX;
        y = newY;
        this.velocidade=velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjetoMovel that = (ObjetoMovel) o;
        return x == that.x &&
                y == that.y &&
                Double.compare(that.velocidade, velocidade) == 0 &&
                Double.compare(that.distancia, distancia) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, velocidade, distancia);
    }

    @Override
    public String toString() {
        return "velocidade -> " + velocidade + ", distancia ->" + distancia;
    }
}

