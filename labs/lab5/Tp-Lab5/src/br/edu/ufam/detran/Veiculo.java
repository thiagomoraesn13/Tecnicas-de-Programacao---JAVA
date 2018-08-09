
package br.edu.ufam.detran;

// Thiago Moraes

public class Veiculo {
    private Pessoa dono;
    private String marca;
    private String cor;

    public Veiculo(Pessoa dono, String marca, String cor) {
        this.dono = dono;
        this.marca = marca;
        this.cor = cor;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    

        
    
}
