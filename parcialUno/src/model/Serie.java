package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Serie extends Categoria {

	private PApplet app;
	public int rating;
	
	public Serie(PImage imagenEnviada, String nombre, int anio, int rating, String tipo, PApplet app) {
		super(imagenEnviada, nombre,anio,rating,tipo,app);
		this.app=app;
		this.rating = rating;
	}
	
	

	public void draw(int posx,int posy) {
		
		app.image(getImagenEnviada(), 30, posy- 10,30,50);
		app.text(getNombre()+" "+ getAnio() + " " + getRating()+"% "+getTipo()+ " ", posx, posy);
	}

	@Override
	public int compareTo(Categoria arg0) {
		
		return this.rating + arg0.getRating();
	}	
	
	
	
	

}

