package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import javafx.scene.image.Image;

public class Tunnel2 extends Map{
	
	Tunnel2(){
		this.portals.add(new Portal(7, 0, "Gate2Opened",3, -8,2));
		this.portals.add(new Portal(7.5, 0, "Gate2Opened",3.5, -8,2));
		this.portals.add(new Portal(8, 0, "Gate2Opened",4, -8,2));
		this.portals.add(new Portal(8.5, 0, "Gate2Opened",4.5, -8,2));
		this.portals.add(new Portal(9, 0, "Gate2Opened",5, -8,2));
		
		this.portals.add(new Portal(8, -11, "WoodStart", 8, -1, 1));
		
		this.makeObstacles(0, 0, 1, 13);
		this.makeObstacles(16, 0, 1, 13);
		this.makeObstacles(0, -11, 17, 1);
		this.makeObstacles(0, 0, 17, 1);
		this.makeObstacles(1, -10, 1, 1);
		this.makeObstacles(15, -10, 1, 1);
		
		this.removeObstacles(8, -12);
		this.removeObstacles(8, -11);
		
		this.mapImage.setImage(new Image("file:image/map/Tunnel2.png"));
		this.id="t2";
	}
}
