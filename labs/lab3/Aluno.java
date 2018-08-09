import java.util.*;

class Aluno{
	String nome;
	int matricula;
	String curso;
	int periodo;

	public Aluno(){
		this.nome = "";
		this.matricula = 0;
		this.curso = "";
		this.periodo = 0;
	}
	public Aluno(String nome, int matricula, String curso, int periodo){
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.periodo = periodo;
	}
	public Aluno(String nome){
		this.nome = nome;
		this.matricula = 0;
		this.curso = "";
		this.periodo = 0;
	}
	public String asString(){
		return "nome:" + nome + "\nmatricula: " + matricula + "\ncurso:"+ curso + "\nperiodo: " + periodo; 
	}
}
