import java.util.*;

class Turma{
	String professor;
	int sala;
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	int numerodaturma;

	public Turma(String professor, int sala, int numerodaturma){
		this.professor = professor;
		this.sala = sala;
		this.numerodaturma = numerodaturma;
	}

	public void addAluno(Aluno aluno){
		alunos.add(aluno);
	}
	public Aluno getAluno(int matricula){
		Iterator<Aluno> alun =  alunos.iterator();
		

		while(alun.hasNext()){
			Aluno aluno = alun.next();
			if(aluno.matricula == matricula){
				return aluno;
			}		
		}
		return null; 
	}
	public void Listar(){
		System.out.println("nome do professor: " + professor + "\nnumero da sala: " + sala + "\nnumero da turma: " + numerodaturma);
		Iterator<Aluno> alun = alunos.iterator();
			while(alun.hasNext()){
				System.out.println(alun.next().asString());
			}
	}
}