import java.util.Scanner;
public class PinturaTotal{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);	
	System.out.println("Digite o valor da altura");
	double altura = scan.nextDouble();

	System.out.println("Digite o valor do comprimento");
	double comprimento = scan.nextDouble();	
	
	System.out.println("Digite o valor do pintor por metro");
	double valor = scan.nextDouble();
	
	double valorfinal = (altura*comprimento*valor) + 100.0;
	System.out.println("Custo total é: " + valorfinal);
}}
	 
