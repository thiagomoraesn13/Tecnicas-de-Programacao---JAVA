package br.edu.ufam.detran;

public class Terrestre extends Veiculo{
    private String humano;

    public Terrestre(String humano, Pessoa dono, String marca, String cor) {
        super(dono, marca, cor);
        this.humano = humano;
    }

    public String getHumano() {
        return humano;
    }

    public void setHumano(String humano) {
        this.humano = humano;
    }
    
    
    
    
}
