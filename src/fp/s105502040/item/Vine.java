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
		texts.add("���j���ý��צ�F�}��");
		event.texts.add("�u�o�]�ת��ӭ�n�F�a...�v");
	}

}
