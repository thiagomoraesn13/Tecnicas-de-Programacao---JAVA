
package br.edu.ufam.detran;
//Thiago Moraes
//21452625

public class SistemaDetran {

    public static void main(String[] args) {
    Pessoa pessoa1 = new Pessoa ("Anakin", "252252222", 20);
    Pessoa pessoa2 = new Pessoa ("Luke", "11122233344", 17);
    
    Carro veloz = new Carro(100, "Terraqueo", pessoa1, "ferrari", "verde");  
    Carro rapido = new Carro(200, "Marte", pessoa2, "hilux", "preta");
    
    Moto honda = new Moto ("bis", 150, "Terraqueo", pessoa1, "honda", "rosa");
    Moto suzuki = new Moto ("fan150", 100, "Lua", pessoa2, "YAMAHA", "AZUL");
    
    
    Aereo aviao = new Aereo("BALAO", pessoa1, "super-voador", "branco");
    Aereo heli = new Aereo("NASA", pessoa2, "bala", "verde");
     
    Maritimo barco = new Maritimo ("moreninha", pessoa1, "aguas-claras", "branco-vermelho");
    Maritimo canoa = new Maritimo ("loirinha", pessoa2, "aguas-vermelhas", "preta");
    
 
    System.out.println(veloz.getDono().getNome());
    System.out.println(veloz.getMarca());
    System.out.println(veloz.getCor());

    System.out.println();
    
    System.out.println(suzuki.getDono().getNome());
    System.out.println(suzuki.getMarca());
    System.out.println(suzuki.getCor());
    
    System.out.println();
    
    System.out.println(aviao.getDono().getNome());
    System.out.println(aviao.getMarca());
    System.out.println(aviao.getCor());
    
    System.out.println();
   
    System.out.println(canoa.getDono().getNome());
    System.out.println(canoa.getMarca());
    System.out.println(canoa.getCor());
    System.out.println(canoa.getBarco());
  
    
  
    }
}
 

