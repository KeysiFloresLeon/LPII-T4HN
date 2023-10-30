package com.pspring5.alumno;

public class Estudiante {
	private String codigo; 
	private String nombre; 
	private String curso;
	private int examenparcial;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getExamenparcial() {
		return examenparcial;
	}
	public void setExamenparcial(int examenparcial) {
		this.examenparcial = examenparcial;
	}
	public Estudiante() {}
}
