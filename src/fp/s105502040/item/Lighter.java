package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;
import javafx.scene.image.Image;

public class Lighter extends GameObject{
	
	
	public Lighter(double x, double y, Image image, String name){
		super(x, y, image, name);
		this.pickable = true;
		atMap="00";
		event = new GameEvent(2,-11);
		id=0;
		texts.add("使用了火柴");
		texts.add("甚麼也沒發生");
		event.texts.add("藤蔓被燒掉了");
		
		this.invIntro = new String("在火柴盒的後方，寫著一個小小的數字 3");
	}
	
	
}
