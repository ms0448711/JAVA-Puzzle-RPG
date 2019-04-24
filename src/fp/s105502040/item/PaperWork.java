package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class PaperWork extends GameObject{

	public PaperWork(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,1);
		atMap="Home1F";
		id=32;
		texts.add("一些關於陰陽與魔法研究報告");
		texts.add("「這次還是失敗了...」");
	}

}
