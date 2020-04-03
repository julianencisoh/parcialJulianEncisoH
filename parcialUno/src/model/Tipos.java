package model;

import java.util.Comparator;

public class Tipos implements Comparator <Categoria>{

	public Tipos() {
	}

	@Override
	public int compare(Categoria o1, Categoria o2) {
		// TODO Auto-generated method stub
		return o1.getTipo().compareTo(o2.getTipo());
	}

}