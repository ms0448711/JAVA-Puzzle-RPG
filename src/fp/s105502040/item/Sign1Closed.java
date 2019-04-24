package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Sign1Closed extends GameObject{

	public Sign1Closed(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate1";
		id=4;
		texts.add("一次倒入4L的X，機關門便會開啟");
	}

}
