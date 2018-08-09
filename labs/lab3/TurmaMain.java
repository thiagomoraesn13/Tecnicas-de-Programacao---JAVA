import java.util.*;
public class TurmaMain{
	public static void main(String args[]){
		Aluno bom = new  Aluno();
		Aluno numero1 = new Aluno();
		Aluno excelente =  new Aluno("THIAGO", 21452625, "COMPUTACAO", 4);
		Aluno numero2 = new Aluno ("FRANCIANE");
		Aluno numero3 =  new Aluno ("Vivi");


		Turma computa = new Turma("HORÁCIO", 1, 2);

		
		computa.addAluno(bom);
		computa.addAluno(numero1);
		computa.addAluno(excelente);
		computa.addAluno(numero2);
		computa.addAluno(numero3);


		computa.Listar();
		System.out.println();

		if(computa.getAluno(21452620) == null){
			System.out.println("erro, aluno nao encontrado");	
		}
		else{

		System.out.println(computa.getAluno(21452620).asString());
		}
	}

}