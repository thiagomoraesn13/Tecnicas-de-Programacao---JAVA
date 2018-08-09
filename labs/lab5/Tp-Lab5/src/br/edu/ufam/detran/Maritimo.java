package br.edu.ufam.detran;

public class Maritimo extends Veiculo{
    private String barco;

    public Maritimo(String barco, Pessoa dono, String marca, String cor) {
        super(dono, marca, cor);
        this.barco = barco;
    }

    public String getBarco() {
        return barco;
    }

    public void setBarco(String barco) {
        this.barco = barco;
    }
    
    
    
}
