package br.edu.icomp.ufam.laboratorio4;

abstract class Retangulo extends FormaGeometrica2D{
	float base;
	float altura;

	public Retangulo(String descricao, float base, float altura){
		super(descricao);
		this.base = base;
		this.altura = altura;
	}
	public float getArea(){
		return base*altura;
	}
}



