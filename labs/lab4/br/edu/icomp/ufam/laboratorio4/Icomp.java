package br.edu.icomp.ufam.laboratorio4;
//THIAGO MORAES
// 21452625
// 4ºLAB DE TP

public class Icomp{
	public static void main(Strings args[]){
		FormaGeometrica circulo = new Circulo("CIRCULO", 5.5);
		FormaGeometrica circulo1 = new Circulo("CIRCULO1", 7.5);
		

		FormaGeometrica retangulo1 = new Retangulo("Retangulo1", 10.5,3.5);
		FormaGeometrica retangulo2 = new Retangulo("Retangulo2", 5.4,10.5);
		
		FormaGeometrica esfera1 = new Esfera("Esfera1", 6.5);
		FormaGeometrica esfera2 = new Esfera("Esfera2", 9.5);

		FormaGeometrica ortoedro1 = new Ortoedro("ortoedro1", 1.5,2.5,3.5);
		FormaGeometrica ortoedro2 = new Ortoedro("ortoedro2", 4.5,5.5,6.5);

		FormaGeometrica vetor[] = new FormaGeometrica[8];

		vetor[0] = circulo;
		vetor[1] = circulo1;
		vetor[2] = retangulo1;
		vetor[3] = retangulo2;
		vetor[4] = esfera1;
		vetor[5] = esfera2;
		vetor[6] = ortoedro1;
		vetor[7] = ortoedro2;

		for(int i=0;i<8;i++){
			if(vetor[i] instanceof FormaGeometrica2D){
				//FormaGeometrica2D teste = (FormaGeometrica2D) vetor[i];  
				System.out.println("descricao" +  vetor[i].getDescricao());
				System.out.println("area" + (FormaGeometrica2D) vetor[i].getArea());

			}else{
				//FormaGeometrica3D teste = (FormaGeometrica3D) vetor[i];  
			//	System.out.println("descricao" + teste.getDescricao());	
			//	System.out.println(vetor[i].getVolume());
			}
		}
}
}
		
