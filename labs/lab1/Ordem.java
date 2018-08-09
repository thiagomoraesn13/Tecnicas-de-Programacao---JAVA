import java.util.Scanner;
public class Ordem{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);	
	System.out.println("Primeiro");
	int a = scan.nextInt();

	System.out.println("Segundo");
	int b = scan.nextInt();	
	
	System.out.println("Terceiro");
	int c = scan.nextInt();
	if(c > b && b > a){
		
		System.out.println(a + " "+ b + " " + c);
		
	return;	
	}
	if(a > b){
		if(b > c){
		System.out.println(c + " "+ b + " " + a);
		}	
		else{
		System.out.println(b + " "+ c + " " + a);
		}
	return;
		}
	if(b > a){
		if(a > c){
		System.out.println(c + " "+ a + " " + b);
		}	
		else{
		System.out.println(a + " "+ c + " " + b);
		}
	return;
		
	}
	if(c > a){
		if(a > b){
		System.out.println(b + " "+ a + " " + c);
		}	
		else{
		System.out.println(a + " "+ b + " " + c);
		}
	return;
	}
	if(a > c){
		if(c > b){
		System.out.println(b + " "+ c + " " + a);
		}	
		else{
		System.out.println(c + " "+ b + " " + a);
		}
	return;
	}
	if(b > c){
		if(c > a){
		System.out.println(a + " "+ c + " " + b);
		}	
		else{
		System.out.println(c + " "+ a + " " + b);
		}
	return;
	}
	if(c > b){
		if(b > a){
		System.out.println(a + " "+ b + " " + c);
		}	
		else{
		System.out.println(b + " "+ a + " " + c);
		}
	return;
	}
	
}
}
	
		  	
	
	
