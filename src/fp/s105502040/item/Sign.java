package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Sign extends GameObject{

	public Sign(double x, double y,String atMap,int id,String text) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		this.atMap=atMap;
		this.id=id;
		this.texts.add(text);
	}

}
