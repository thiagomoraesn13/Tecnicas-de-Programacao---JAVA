
package br.edu.ufam.detran;


public class Moto extends Terrestre{
    private String nome;
    private int velocidade;

    public Moto(String nome, int velocidade, String humano, Pessoa dono, String marca, String cor) {
        super(humano, dono, marca, cor);
        this.nome = nome;
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
