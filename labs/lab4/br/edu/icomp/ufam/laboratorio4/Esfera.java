package br.edu.icomp.ufam.laboratorio4;

abstract class Esfera extends FormaGeometrica3D{
	
	float pi =3.14;
	float raio;

	public Esfera(String descricao, float raio){
		super(descricao);
		this.raio = raio;
	}
	public float getVolume(){
		return (4*pi*(raio*raio*raio))/3;
	}

}
