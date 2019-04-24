package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;

public class Begining extends GameObject{

	public Begining(double x, double y) {
		super(x, y);
		this.pickable=false;
		this.taken=true;
		event = new GameEvent(-1,-1);
		atMap="00";
		id=-100;
		texts.add("「又被自己的魔法傳送了...」");
		texts.add("「這裡好像曾經是用來防止外來者進來的洞穴」");
		texts.add("「......」");
		texts.add("「先找回家的路好了...」");
		event.texts.add("");
	}

}
