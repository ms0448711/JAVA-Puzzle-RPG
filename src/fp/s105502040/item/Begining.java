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
		texts.add("�u�S�Q�ۤv���]�k�ǰe�F...�v");
		texts.add("�u�o�̦n�����g�O�ΨӨ���~�Ӫ̶i�Ӫ��}�ޡv");
		texts.add("�u......�v");
		texts.add("�u����^�a�����n�F...�v");
		event.texts.add("");
	}

}
