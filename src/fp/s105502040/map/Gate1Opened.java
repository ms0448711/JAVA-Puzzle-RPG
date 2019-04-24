package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Sign1Opened;
import javafx.scene.image.Image;

public class Gate1Opened extends Map{
	
	public Sign1Opened sign1Opened = new Sign1Opened( 7, -9);
		
	
	Gate1Opened(){
		this.portals.add(new Portal(0,-1,"t1",15,-6,3));
		this.portals.add(new Portal(0,-1.5,"t1",15,-6.5,3));
		this.portals.add(new Portal(0,-2,"t1",15,-7,3));
		
		this.portals.add(new Portal( 8, -9, "Gate2", 3, -1, 1));
		this.portals.add(new Portal( 8.5, -9, "Gate2", 3.5, -1, 1));
		this.portals.add(new Portal(  9, -9, "Gate2", 4, -1, 1));
		this.portals.add(new Portal( 9.5, -9, "Gate2", 4.5, -1, 1));
		this.portals.add(new Portal( 10, -9, "Gate2", 5, -1, 1));
		
		this.makeObstacles(0, 0, 17, 1);
		this.makeObstacles(0, -3, 4, 9);
		this.makeObstacles(4, -9, 12, 2);
		this.makeObstacles(15, -2, 1, 12);
		this.makeObstacles(13, -1, 2, 1);
		this.makeObstacles(4, -5, 2, 1);
		this.makeObstacles(7, -3, 1, 2);
		this.makeObstacles(7, -6, 1, 1);
		this.makeObstacles(11, -3, 1, 2);
		this.makeObstacles(11, -6, 1, 2);
		this.removeObstacles(8, -9);
		this.removeObstacles(9, -9);
		this.removeObstacles(10, -9);
		
		
		
		id="Gate1Opened";
		mapImage.setImage(new Image("file:image/map/Gate1Opened.png"));
		
		putItem(sign1Opened);
	}
}
