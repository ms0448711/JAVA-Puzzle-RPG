package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Door1 extends GameObject{

	public Door1(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate1";
		id=3;
		texts.add("大門中間有個小洞，似乎是甚麼機關");
	}

}
