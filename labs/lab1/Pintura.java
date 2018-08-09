import java.util.Scanner;
public class Pintura{
	public static void main(String args[]){
	double total = 100.0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o valor do pintor por metro");
	double valor = scan.nextDouble();
	double m = 12*3*valor;
	
	double valorfinal = m + total;
	System.out.println("Custo total é: " + valorfinal);
}}
	 
