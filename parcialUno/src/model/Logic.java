package model;

import java.util.*;
import processing.core.PApplet;
import processing.core.PImage;

public class Logic {

	
	private PApplet app;
	private String[] dataUno;
	private LinkedList<Categoria> listaPeliculas;
	private Nombres nombres;
	private Anios anios;
	private Tipos tipos;
	private int provisional;
	
	
	public Logic(PApplet app1) {

		this.app = app1;
		nombres = new Nombres();
		anios = new Anios();
		tipos = new Tipos();
		
		
		listaPeliculas = new LinkedList<Categoria>();
		dataUno = app.loadStrings("./data/imports/netflix.txt");
		traerTextos();

	}
	
	private void traerTextos() {

		for (int i = 0; i < dataUno.length; i++) {
			String[] pasajeroUno = dataUno[i].split(",");
		
		
		
					String nombre = pasajeroUno[0];
					int anio =Integer.parseInt(pasajeroUno[1]); 		
					int rating = Integer.parseInt(pasajeroUno[2]);
					String tipo = pasajeroUno[3];
					PImage imagen1 = app.loadImage("../data/imports/img/"+nombre.replace(" ",  "").toLowerCase()+".jpg");
					
					if(pasajeroUno[3].contentEquals("serie")) {
						listaPeliculas.add(new Serie(imagen1, nombre,anio, rating, tipo, app));
					}else {
						
						listaPeliculas.add(new Pelicula(imagen1, nombre, anio, rating, tipo,app));
					}
		}
		

	}
	
	public LinkedList<Categoria>getListaPeliculas(){
		return listaPeliculas;
	}

	public void setListaPeliculas(LinkedList<Categoria> listaPeliculas) {
		this.listaPeliculas = listaPeliculas;
	}
		


	public void organizarInfo(int a) {
		switch (a) {
		case 0:
			Collections.sort(listaPeliculas,nombres);
			
			break;

		case 1:
			Collections.sort(listaPeliculas,anios);
			
			break;
		case 2:
			Collections.sort(listaPeliculas);
			
			break;
		case 3:
			Collections.sort(listaPeliculas,tipos);
			break;
		}
		
	}
	
	public LinkedList<Categoria> getDatosLista() {
		return listaPeliculas;
	}

	public void setContenido(LinkedList<Categoria> listaPeliculas) {
		this.listaPeliculas =listaPeliculas;
	}
	
	
	
public void meterInfo() {
		
		String[] textos;
		textos = new String[listaPeliculas.size()];
		
		for (int l=0;l<listaPeliculas.size();l++) {
			String nombre= "Nombre: " + listaPeliculas.get(l).getNombre().toUpperCase();
			String año="Año: " + listaPeliculas.get(l).getAnio();
			String rating= "Rating: " + listaPeliculas.get(l).getRating()+"%";
			String tipo= "Tipo: " + listaPeliculas.get(l).getTipo();
			
			textos[l] = nombre+año+rating+tipo;
			
			
		}
		
		
		switch (provisional) {
		case 0:
			app.saveStrings("./data/imports/nombres.txt", textos);
			break;
		case 1:
			app.saveStrings("./data/imports/anios.txt", textos);
			break;
		case 2:
			app.saveStrings("./data/imports/ratings.txt", textos);
			break;
		case 3:
			app.saveStrings("./data/imports/tipos.txt",textos);
			break;
		
		}
		
	
}
	
	
}
