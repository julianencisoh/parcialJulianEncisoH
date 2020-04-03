package controller;

import model.Logic;
import processing.core.PApplet;

import java.util.LinkedList;

import model.Categoria;

public class Controller {

	private PApplet app;
	private Logic logic;

	public Controller(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}

	public void organizarInfo(char tecla) {

		switch (tecla) {
		case 'a':
			logic.organizarInfo(0);
			break;
		case 's':
			logic.organizarInfo(1);
			break;
		case 'd':
			logic.organizarInfo(2);
			break;
		case 'f':
			logic.organizarInfo(3);
			break;
		}

	}

public LinkedList<Categoria> LiknedList() {
		
		return logic.getDatosLista();
	
}

}
