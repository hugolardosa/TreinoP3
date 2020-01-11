package ex1;

import java.util.Random;

public enum DiaSemana {
    segunda(1),
    terça(2),
    quarta(3),
    quinta(4),
    sexta(5),
    sabado(6),
    domingo(7);

    private final int sem;
    private DiaSemana(int s) {
        this.sem=s;
    }

    public int getDiaNum() {
        return sem;
    }

    private DiaSemana getDia(int d){
        for(DiaSemana s : DiaSemana.values()){
            if(s.getDiaNum() == d){
                return s;
            }
        }
        return null;
    }

    public static DiaSemana rand(){
        int value = (int) Math.random() * (7-1) + 1;
        return getDia(value);
    }

}
