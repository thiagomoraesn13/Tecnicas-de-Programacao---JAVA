package br.edu.ufam.detran;


public class Aereo extends Veiculo {
    private String aviao;

    public Aereo(String aviao, Pessoa dono, String marca, String cor) {
        super(dono, marca, cor);
        this.aviao = aviao;
    }

    public String getAviao() {
        return aviao;
    }

    public void setAviao(String aviao) {
        this.aviao = aviao;
    }
    
    
    
    
}
