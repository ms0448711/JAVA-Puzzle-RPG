package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Bed;
import javafx.scene.image.Image;

public class Home2F extends Map{
	
	public Bed bed0 = new Bed(1,-9,"「睡覺吧」",30);
	public Bed bed1 = new Bed(1,-8,"「睡覺吧」",30);
	public Bed bed2 = new Bed(9,-8,"「這種大床總是讓我渾身不對勁，還是我房間的床比較舒服」",31);
	
	Home2F(){
		
		this.portals.add(new Portal(15,-5,"Home1F",13,-7,3));
		
		this.makeObstacles(0, 0, 1, 13);
		this.makeObstacles(0, 0, 17, 1);
		this.makeObstacles(1, -2, 1, 3);
		this.makeObstacles(3, -2, 5, 3);
		this.makeObstacles(9, -2, 3, 3);
		this.makeObstacles(14, -1, 2, 4);
		this.makeObstacles(14, -5, 1, 2	);
		this.makeObstacles(11, -5, 1, 7);
		this.makeObstacles(5, -5, 1, 7);
		this.makeObstacles(4, -6, 1, 1);
		this.makeObstacles(6, -7, 1, 1);
		this.makeObstacles(10, -7, 1, 1);
		this.makeObstacles(12, -9, 4, 1);
		this.makeObstacles(9, -8, 2, 2);
		this.makeObstacles(6, -9, 3, 1);
		this.makeObstacles(3, -9, 2, 1);
		this.makeObstacles(0.7, -8, 1, 2);
		this.makeObstacles(1, -10, 3, 1);
		this.makeObstacles(16, 0, 1, 13);
		
		
		this.id="Home2F";
		this.mapImage.setImage(new Image("file:image/map/Home2F.png"));
		
		
		putItem(bed0);
		putItem(bed1);
		putItem(bed2);
	}
}
