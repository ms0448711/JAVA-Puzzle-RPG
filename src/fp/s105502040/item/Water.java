package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Water extends GameObject{

	public Water(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="t1";
		id=2;
		texts.add("�M�����a�U���q�e��y�U��");
	}

}
