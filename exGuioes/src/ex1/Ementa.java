package ex1;

import java.util.ArrayList;

public class Ementa {
    private String nome;
    private String local;
    private ArrayList<Prato> pratos;

    public Ementa(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.pratos = new ArrayList<>();
    }

    public void toFile(){

    }

    public void addPrato(Prato prato, DiaSemana rand){
        pratos.add(prato);
    }

    public void removePrato(Prato prato){
        pratos.remove(prato);
    }

    public void containsPrato(Prato prato){
        pratos.contains(prato);
    }

    @Override
    public String toString() {
        return "Ementa{" +
                "nome='" + nome + '\'' +
                ", local='" + local + '\'' +
                ", pratos=" + pratos +
                '}';
    }
}
