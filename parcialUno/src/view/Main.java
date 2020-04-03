package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	private Controller controller;

	public static void main(String[] args) {
		PApplet.main("view.Main");

	}

	public void settings() {
		size(700, 700);
	}

	public void setup() {
		controller = new Controller(this);
	}

	public void draw() {
		background(0);
		
for (int i=0;i<controller.LiknedList().size();i++) {
			
			int posx= 70;
			int posy= 50*(i+1);
			
			controller.LiknedList().get(i).draw(posx,posy);
			
		}
		
		textSize(20);
		text("a organiza por nombres",250,620);
		text("s organiza por años de lanzamiento",200,640);
		text("d organiza por rating",260,660);
		text("f organiza por tipo",260,680);
		
		
	}
	
	public void keyPressed() {
		
		controller.organizarInfo(key);
	}

}
