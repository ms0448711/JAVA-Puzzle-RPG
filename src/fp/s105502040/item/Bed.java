package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Bed extends GameObject{

	public Bed(double x, double y,String str ,int id) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Home2F";
		this.id=id;
		texts.add(str);
	}
	
}
