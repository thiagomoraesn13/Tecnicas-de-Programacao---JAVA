
package fila;
//classe para conter as informações sobre os pacientes
public class Pessoas {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String telefone;
    private String pri;
    private String numero;

    public Pessoas(String nome, String cpf, String rg, String endereco, String telefone, String prioridade, String numero) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.telefone = telefone;
        this.pri = prioridade;
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getPri() {
        return pri;
    }
    public void setPri(String prioridade) {
        this.pri = prioridade;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
}