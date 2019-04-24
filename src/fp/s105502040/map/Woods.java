package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Sign;
import javafx.scene.image.Image;

public class Woods extends Map{
	
	public Sign wood;
	
	Woods(String mapName,int direction,String hint){
		
		switch(direction){
		case 1:
			this.portals.add(new Portal(8,-12,"Woods2",8,-2,1));
			this.portals.add(new Portal(16,-6,"WoodStart",8,-2,1));
			this.portals.add(new Portal(8,0,"WoodStart",8,-2,1));
			this.portals.add(new Portal(0,-6,"WoodStart",8,-2,1));
		case 2:
			this.portals.add(new Portal(8, 0,"Woods3",8,-2,1));
			this.portals.add(new Portal(16,-6,"WoodStart",8,-2,1));
			this.portals.add(new Portal(0,-6,"WoodStart",8,-2,1));
			this.portals.add(new Portal(8,-12,"WoodStart",8,-2,1));
		case 3:
			this.portals.add(new Portal(0,-6,"Woods4",8,-2,1));
			this.portals.add(new Portal(16,-6,"WoodStart",8,-2,1));
			this.portals.add(new Portal(8,0,"WoodStart",8,-2,1));
			this.portals.add(new Portal(8,-12,"WoodStart",8,-2,1));
		case 4:
			this.portals.add(new Portal(16,-6,"HomeClosed",8,-2,1));
			this.portals.add(new Portal(8,0,"WoodStart",8,-2,1));
			this.portals.add(new Portal(0,-6,"WoodStart",8,-2,1));
			this.portals.add(new Portal(8,-12,"WoodStart",8,-2,1));
		}
		
		
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
		
		this.makeObstacles(8, -6, 1, 1);
		
		
		this.wood=new Sign(8, -6, mapName, direction*100, hint);
		this.id=mapName;
		this.mapImage.setImage(new Image("file:image/map/Woods.png"));
		
		putItem(wood);
	}
}
