package model;

import java.util.Comparator;

public class Anios implements Comparator <Categoria>{

	public Anios() {
	}

	@Override
	public int compare(Categoria anio1, Categoria anio2) {
		return anio1.getAnio() - anio2.getAnio();
	}
}

