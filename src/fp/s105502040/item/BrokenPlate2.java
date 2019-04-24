package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class BrokenPlate2 extends GameObject{

	public BrokenPlate2(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Gate2";
		id=10;
		texts.add("上面只能清楚看到一個字－－「L」");
	}
	
}