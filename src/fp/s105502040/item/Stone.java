package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Stone extends GameObject{

	public Stone(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="HomeClosed";
		id=9999;
		texts.add("¡u±K½Xªü......¡v");
	}

}
