class Processaador{
	private String arm;
	private Double velocidade;

	public  Processaador (String arm, Double velocidade){
		this.arm = arm;
		this.velocidade = velocidade;

	}
	public String getDescricao(){
		return arm + "  <->  velocidade: " + velocidade;
	}
}

class Memoria{
	private String ram;
	private String virtual;

	public Memoria(String ram, String virtual){
		this.ram = ram;
		this.virtual = virtual;
	}
	public String getDescricao(){
		return  ram + " <-> Memoria: " + virtual;
	}

} 

class Disco{
	private String hd;
	private double rapido;

	public Disco(String hd, double rapido){
		this.hd = hd;
		this.rapido = rapido;
	}
	public String getDescricao(){
		return hd + "  <-> Potência: " + rapido;
	}
}

class Computador{
	Processaador intel;
	Memoria cache;
	Disco espaco;

	public Computador(Processaador intel, Memoria cache, Disco espaco){
		this.intel = intel;
		this.cache = cache;
		this.espaco = espaco;
	}

	public String getDescricao(){
		return "Processador: " + intel.getDescricao() + "\n Memoria: " + cache.getDescricao() + "\n Disco: " + espaco.getDescricao();

	}
}

public class ComputadorMain{
	
	public static void main(String args[]){
		Processaador hard = new Processaador("intel", 4.5);
		Memoria disk = new Memoria("Ram", "virtual");
		Disco hd = new Disco("hd", 2.5);
		Computador computer = new Computador(hard, disk, hd);
		System.out.println(computer.getDescricao());
	}

}