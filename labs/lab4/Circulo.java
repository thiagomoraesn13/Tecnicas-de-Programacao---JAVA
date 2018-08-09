package br.edu.icomp.ufam.laboratorio4;

abstract class Circulo extends FormaGeometrica2D{
	float pi = 3.14;
	float raio;

	public Circulo(String descricao, float raio){
		super(descricao);
		this.raio = raio;

	}

	public float getArea(){
		return "area do circulo "+ pi*raio*;
	}
}