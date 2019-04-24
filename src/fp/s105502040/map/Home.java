package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import javafx.scene.image.Image;

public class Home extends Map{
	
	
	Home(){
		
		this.portals.add(new Portal(8,0,"WoodStart",8,-10,2));
		this.portals.add(new Portal(8,-5,"Home1F",9,-1,1));
		
		this.makeObstacles(7, 0, 1, 4);
		this.makeObstacles(9, 0, 1, 4);
		this.makeObstacles(7, -5, 1, 2);
		this.makeObstacles(9, -5, 1, 2);
		this.makeObstacles(6, 0, 1, 6);
		this.makeObstacles(10, 0, 1, 6);
		this.makeObstacles(8, -6, 1, 2);
		
		
		this.id="Home";
		this.mapImage.setImage(new Image("file:image/map/Home.png"));
	}
}
