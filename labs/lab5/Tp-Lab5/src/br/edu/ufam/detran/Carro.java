package br.edu.ufam.detran;

public class Carro extends Terrestre {
    private int velocidade;

    public Carro(int velocidade, String humano, Pessoa dono, String marca, String cor) {
        super(humano, dono, marca, cor);
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    

    
}
