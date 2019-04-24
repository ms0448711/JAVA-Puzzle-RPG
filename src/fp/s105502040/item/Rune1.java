package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Rune1 extends GameObject{

	public Rune1(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate2";
		id=7;
		texts.add("X=");
	}
	
}
