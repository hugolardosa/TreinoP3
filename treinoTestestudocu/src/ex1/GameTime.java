package ex1;

public class GameTime {
    private int h;
    private int m;
    private int s;

    public GameTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public GameTime(int in_seg) {
        this.h = in_seg / 3600;
        this.m = (in_seg - (this.h * 3600)) / 60;
        this.s = in_seg - (this.h * 3600) - (this.m * 60);
    }

    public int getH() {
        return h;
    }

    public int getM() {
        return m;
    }

    public int getS() {
        return s;
    }

    public void addTime(int add_seg){
        int novo_seg = 0;
        novo_seg +=  this.h * 3600;
        novo_seg += 60 * this.m;
        novo_seg +=  this.s;
        novo_seg += add_seg;
        new GameTime(novo_seg);
    }
}
