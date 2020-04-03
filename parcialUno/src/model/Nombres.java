package model;

import java.util.Comparator;

public class Nombres implements Comparator <Categoria>{

	public Nombres() {
	}

	@Override
	public int compare(Categoria o1, Categoria o2) {
		// TODO Auto-generated method stub
		return o1.getNombre().compareTo(o2.getNombre());
	}

}