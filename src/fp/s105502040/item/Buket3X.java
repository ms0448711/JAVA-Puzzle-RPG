package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;
import javafx.scene.image.Image;



public class Buket3X extends Buket{
	
	
	
	public Buket3X(double x, double y, Image image, String name){
			super(x, y, image, name);
			this.pickable = true;
			atMap="Gate1";
			event = new GameEvent(1,-8);
			id=-3;
			texts.add("");
			event.texts.add("");
			
			this.invIntro = new String("在桶子底部寫著「"+this.contain+"L的X」");
	}
}

