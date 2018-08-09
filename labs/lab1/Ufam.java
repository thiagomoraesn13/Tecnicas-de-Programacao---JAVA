import java.util.Scanner;
public class Ufam{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	System.out.println("Digite o ano em que foi fundada a Ufam");
	int idade = scan.nextInt();
	int atual = 2015 - idade;
	System.out.println("A UFAM TEM " + atual  + " anos de fundação");
}}
	 
