package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class DryWater extends GameObject{

	public DryWater(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate1";
		id=33;
		texts.add("「似乎是乾涸後留下的水坑」");
	}
	
}
