package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Categoria implements Comparable<Categoria> {

	private int anio, rating;
	private String nombre, tipo;
	private PApplet app;
	private PImage imagenEnviada;

	public Categoria(PImage imagenEnviada, String nombre, int anio, int rating, String tipo, PApplet app) {

		this.imagenEnviada=imagenEnviada;
		this.nombre = nombre;
		this.anio = anio;
		this.rating = rating;
		this.tipo = tipo;
		this.app = app;
	}

	public PImage getImagenEnviada() {
		return imagenEnviada;
	}

	public void setImagenEnviada(PImage imagenEnviada) {
		this.imagenEnviada = imagenEnviada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public void draw(int posx, int posy) {

	}

}
