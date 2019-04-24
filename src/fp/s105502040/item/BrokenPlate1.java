package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class BrokenPlate1 extends GameObject{

	public BrokenPlate1(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate2";
		id=9;
		texts.add("「唯一...不在...」，只看得清楚這幾個字");
	}
	
}
