package br.edu.icomp.ufam.laboratorio4;

abstract class Ortoedro extends FormaGeometrica3D{
	
	float altura;
	float prondidade;
	float largura;

	public Ortoedro(String descricao, float altura, float profundidade, float largura){
		super(descricao);
		this.altura = altura;
		this.profundidade = profundidade;
		this.largura = largura
	}

	public float getVolume(){
		return altura*profundidade*largura;
	}

}