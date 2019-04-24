package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Water;
import javafx.scene.image.Image;

public class Tunnel1 extends Map{
	
	public Water water1 = new Water(1 , -8);
	public Water water2 = new Water(2 , -8);
	public Water water3 = new Water(3 , -8);
	
	Tunnel1(){
		this.portals.add(new Portal(7 ,0, "001", 2, -10, 2));
		this.portals.add(new Portal(16, -6, "Gate1", 1, -1, 4));
		this.portals.add(new Portal(16, -6.5, "Gate1", 1, -1.5 ,4));
		this.portals.add(new Portal(16, -7, "Gate1", 1, -2, 4));
		
		this.makeObstacles(0, 0, 7, 5);
		this.makeObstacles(8, 0, 9, 6);
		this.makeObstacles(0, -5, 1, 8);
		this.makeObstacles(1, -8, 16, 3);
		this.makeObstacles(6, -5, 1, 1);
		
		
		
		this.mapImage.setImage(new Image("file:image/map/Tunnel1.png"));
		this.id="t1";
		
		putItem(water1);
		putItem(water2);
		putItem(water3);
	}
}
