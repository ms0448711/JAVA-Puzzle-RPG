package fp.s105502040.item;

import fp.s105502040.GameEvent;
import fp.s105502040.GameObject;
import javafx.scene.image.Image;

public class Lighter extends GameObject{
	
	
	public Lighter(double x, double y, Image image, String name){
		super(x, y, image, name);
		this.pickable = true;
		atMap="00";
		event = new GameEvent(2,-11);
		id=0;
		texts.add("�ϥΤF����");
		texts.add("�ƻ�]�S�o��");
		event.texts.add("�ý��Q�N���F");
		
		this.invIntro = new String("�b���㲰�����A�g�ۤ@�Ӥp�p���Ʀr 3");
	}
	
	
}
