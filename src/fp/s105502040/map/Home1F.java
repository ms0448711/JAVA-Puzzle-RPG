package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.PaperWork;
import javafx.scene.image.Image;

public class Home1F extends Map{
	
	public PaperWork paperWork = new PaperWork(8, -5);

	Home1F(){
		
		this.portals.add(new Portal(9,0,"Home",8,-4,2));
		this.portals.add(new Portal(14,-7,"Home2F",15,-6,1));
		
		this.makeObstacles(0, 0, 9, 0);
		this.makeObstacles(0, 0, 1, 13);
		this.makeObstacles(1, -2, 2, 1);
		this.makeObstacles(1, -3, 4, 4);
		this.makeObstacles(1, -8, 3, 4);
		this.makeObstacles(4, -9, 3, 2);
		this.makeObstacles(7, -10, 9, 1);
		this.makeObstacles(12, -9, 2, 1);
		this.makeObstacles(8, -5, 3, 3);
		this.makeObstacles(12, -2, 4, 4);
		this.makeObstacles(10, 0, 6, 1);
		this.makeObstacles(8, -1, 1, 1);
		this.makeObstacles(10, -1, 1, 1);
		this.makeObstacles(16, 0, 1, 13);
		
		putItem(paperWork);
		
		this.id="Home1F";
		this.mapImage.setImage(new Image("file:image/map/Home1F.png"));
	}
}
