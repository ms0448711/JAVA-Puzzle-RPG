package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Stone;
import javafx.scene.image.Image;

public class HomeClosed extends Map{
	
	public Stone stone = new Stone(8, -5);
	
	HomeClosed(){
		
		this.portals.add(new Portal(8,0,"WoodStart",8,-10,2));
		
		this.makeObstacles(7, 0, 1, 4);
		this.makeObstacles(9, 0, 1, 4);
		this.makeObstacles(7, -5, 1, 2);
		this.makeObstacles(9, -5, 1, 2);
		this.makeObstacles(6, 0, 1, 6);
		this.makeObstacles(10, 0, 1, 6);
		this.makeObstacles(8, -5, 1, 2);
		
		this.id="HomeClosed";
		this.mapImage.setImage(new Image("file:image/map/HomeClosed.png"));
		
		putItem(stone);
	}
}
