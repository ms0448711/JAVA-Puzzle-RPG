package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Null extends GameObject{

	public Null(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,-1);
		atMap="00";
		id=-1;
		texts.add("");
		event.texts.add("");
	}

}
