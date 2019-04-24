package fp.s105502040.map;

import fp.s105502040.*;
import fp.s105502040.item.Lighter;
import fp.s105502040.item.Null;
import fp.s105502040.item.Vine;
import javafx.scene.image.Image;


public class Map00 extends Map{
	
	
	public Lighter lighter = new Lighter(14,-9,new Image("file:image/item/lighter.png"),"¤õ®ã²°");
	public Vine vine = new Vine(2, -11);
	
	
	public Map00(){
		id="00";
		mapImage.setImage(new Image("file:image/map/Map00.png"));
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
		this.makeObstacles(2, -11, 1, 2);
		for(int i=0;i>-13;i--){
			this.obstacles.add(new Obstacle(-1,i));
			this.obstacles.add(new Obstacle(17,i));
		}
		for(int i=0;i<17;i++){
			this.obstacles.add(new Obstacle(i,1));
			this.obstacles.add(new Obstacle(i,-13));
		}
		
		
		putItem(lighter);
		putItem(vine);
		
	}
	
	
}
