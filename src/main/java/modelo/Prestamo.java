package modelo;

import modelo.Bibliotecario;
import modelo.Libro;

import java.util.ArrayList;
import java.util.Date;

public class Prestamo {
	private Date fechaInicio;
	private Date fechaTermino;
	private ArrayList<Libro> libro = new ArrayList<Libro>();
	private Usuario usuario;
	private Bibliotecario bibliotecario;

	public Prestamo(Date fechaInicio, Date fechaTermino, ArrayList<Libro> libros, Usuario usuario, Bibliotecario bibliotecario) {
		this.fechaInicio = fechaInicio;
		this.fechaTermino = fechaTermino;
		this.libro = libros;
		this.usuario = usuario;
		this.bibliotecario = bibliotecario;
	}

	public Bibliotecario getBibliotecario() {
		return this.bibliotecario;
	}

	public void setBibliotecario(Bibliotecario bibliotecario) {
		this.bibliotecario = bibliotecario;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public Date getFechaTermino() {
		return this.fechaTermino;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaTermino(Date fechaTermino) {
		this.fechaTermino = fechaTermino;
	}

	public Libro getLibro() {
		return libro.get(0);
	}

	public void setLibro(Libro libro) {
		this.libro.add(libro);
	}

}