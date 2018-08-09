import java.util.Scanner;
public class SomaDigitos{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);	
	System.out.println ("Digite o valor");
	int ler = scan.nextInt();
	
	int a = ler / 1000;
	ler = ler % 1000;
	int b = ler /100;
	ler = ler % 100;
	
	int c = ler / 10;
	ler = ler % 10;
	 
	int total = a+b+c+ler;
	System.out.println (a + " " + b +" " + c + " " + ler +" : -> total = " + total);
	
	
	 
}}
