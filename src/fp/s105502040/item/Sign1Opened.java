package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Sign1Opened extends GameObject{

	public Sign1Opened(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate1Opended";
		id=5;
		texts.add("4LªºX...¡AX¬O¬Æ»ò¡H");
	}

}
