import java.util.Scanner;
public class notas{
	public static void main( String args[]){
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o valor para sacar: ");
		int saldo = ler.nextInt();
		int a = 0;
		int b = 0;
		int c = 0;
		int soma=0;
		if (saldo < 50){
			if(saldo % 10 == 0){
				b = saldo / 10;
				System.out.println("Notas de 50: " + a);
				System.out.println("Notas de 10: " + b);
				System.out.println("Notas de 2:  " + c);
			}
			else{
				b = saldo / 10;
				saldo = saldo % 10;
				c = saldo / 2;
				System.out.println("Notas de 50: " + a);
				System.out.println("Notas de 10: " + b);
				System.out.println("Notas de 2:  " + c); 
			}
 		}
 		else{
 			if(saldo % 50 ==0){
 				a = saldo / 50;
 				System.out.println("Notas de 50: " + a);
				System.out.println("Notas de 10: " + b);
				System.out.println("Notas de 2:  " + c);	
 			}
 			else{
 				a = saldo / 50;
 				saldo = saldo % 50;
 				if(saldo%10 == 0){
 				b = saldo / 10;	
 				System.out.println("Notas de 50: " + a);
				System.out.println("Notas de 10: " + b);
				System.out.println("Notas de 2:  " + c);
 				}
 				else{
 				b = saldo / 10;
 				c = (saldo% 10) / 2;
 				System.out.println("Notas de 50: " + a);
				System.out.println("Notas de 10: " + b);
				System.out.println("Notas de 2:  " + c); 
 				}
 			} 
 		}
 	}
 }