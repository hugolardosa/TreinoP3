package ex1;

public class PratoDieta extends Prato{
    private double LimCalorias;
    private double CaloriasPrato;

    public PratoDieta(String nome, double limCalorias) {
        super(nome);
        LimCalorias = limCalorias;
        CaloriasPrato = 0;
    }

    public double getLimCalorias() {
        return LimCalorias;
    }

    public double getCaloriasPrato() {
        return CaloriasPrato;
    }

    @Override
    public boolean addIngrediente(Alimento a) {
        if(LimCalorias > CaloriasPrato + a.getCalorias()){
            return super.addIngrediente(a);
        }
        else
            return false;
    }

    @Override
    public boolean removeIngrediente(Alimento a) {
        CaloriasPrato -= a.getCalorias();
        return super.removeIngrediente(a);
    }

    @Override
    public boolean containsIngrediente(Alimento a) {
        return super.containsIngrediente(a);
    }
}
