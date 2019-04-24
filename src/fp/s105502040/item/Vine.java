package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Vine extends GameObject{

	public Vine(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(2,-11);
		atMap="00";
		id=1;
		texts.add("巨大的藤蔓擋住了洞穴");
		event.texts.add("「這也擋的太剛好了吧...」");
	}

}
