package br.edu.icomp.ufam.laboratorio4;

abstract class FormaGeometrica3D extends FormaGeometrica{
	
	public FormaGeometrica3D(String descricao){
		super(descricao);
	}
	abstract float getVolume(); 
}