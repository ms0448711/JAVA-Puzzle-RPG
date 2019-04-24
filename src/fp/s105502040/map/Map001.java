package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Obstacle;
import fp.s105502040.Portal;
import javafx.scene.image.Image;

public class Map001 extends Map{
	Map001(){
		this.portals.add(new Portal(2, -11, "t1", 7, -1 , 1));
		
		this.mapImage.setImage(new Image("file:image/map/Map001.png"));
		this.id="001";
		
		
		this.obstacles.add(new Obstacle(8,-7));
		this.makeObstacles(0, -2, 1, 11);
		this.makeObstacles(1, 0, 15, 3);
		this.makeObstacles(4, -3, 3, 1);
		this.makeObstacles(10, -3, 3, 1);
		this.makeObstacles(12, -3, 4, 3);
		this.makeObstacles(16, -5, 1, 5);
		this.makeObstacles(3, -6, 1, 4);
		this.makeObstacles(4, -5, 2, 9);
		this.makeObstacles(6, -7, 2, 4);
		this.makeObstacles(8, -10, 8, 2);
		this.makeObstacles(1, -11, 1, 2);
		this.makeObstacles(3, -11, 1, 2);
		for(int i=0;i>-13;i--){
			this.obstacles.add(new Obstacle(-1,i));
			this.obstacles.add(new Obstacle(17,i));
		}
		for(int i=0;i<17;i++){
			this.obstacles.add(new Obstacle(i,1));
			this.obstacles.add(new Obstacle(i,-13));
		}
	}
}
