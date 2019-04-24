package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Sign;
import javafx.scene.image.Image;

public class WoodStart extends Map{
	
	public Sign signWoodStart = new Sign(6, -5,"WoodStart",20,"誠實與會說謊的木頭...");
	public Sign wood = new Sign(8, -6,"WoodStart",21,"回家的方向↑");
	
	WoodStart(){
		
		this.portals.add(new Portal(8, 0, "t2", 8, -10,2));
		
		this.portals.add(new Portal( 8, -12, "Woods1", 8, -2, 1));
		
		this.portals.add(new Portal(0, -6, "WoodStart", 14,-6,3));
		this.portals.add(new Portal(16, -6, "WoodStart", 2,-6,4));
		
		this.makeObstacles(4, 0, 4, 4);
		this.makeObstacles(2, 0, 2, 5);
		this.makeObstacles(0, 0, 2, 6);
		this.makeObstacles(0, -7, 3, 4);
		this.makeObstacles(3, -8, 1, 3);
		this.makeObstacles(4, -9, 4, 4);
		this.makeObstacles(9, -9, 4, 4);
		this.makeObstacles(14, -8, 1, 3);
		this.makeObstacles(14, -7, 3, 4);
		this.makeObstacles(9, 0, 4, 4);
		this.makeObstacles(13, 0, 2, 5);
		this.makeObstacles(15, 0, 2, 6);
		
		this.makeObstacles(4, -8, 1, 1);
		this.makeObstacles(11, -8, 1, 1);
		
		this.makeObstacles(6, -5, 1, 1);
		this.makeObstacles(8, -6, 1, 1);
		
		
		this.id="WoodStart";
		this.mapImage.setImage(new Image("file:image/map/WoodStart.png"));
		
		putItem(signWoodStart);
		putItem(wood);
	}
	
	
}
