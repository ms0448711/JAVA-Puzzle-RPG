package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.BrokenPlate1;
import fp.s105502040.item.BrokenPlate2;
import fp.s105502040.item.Rune1;
import fp.s105502040.item.Rune2;
import fp.s105502040.item.Sign;
import javafx.scene.image.Image;

public class Gate2Opened extends Map{
	public Rune1 rune1 = new Rune1(7,-6);
	public Rune2 rune2 = new Rune2(13,-3);
	public BrokenPlate1 brokenPlate1 = new BrokenPlate1(12,-6);
	public BrokenPlate2 brokenPlate2 = new BrokenPlate2(8,-3);
	public Sign sign2Closed = new Sign(2, -9,"Gate2",11,"¡uª÷¡v=2");
	
	Gate2Opened(){
		this.portals.add(new Portal( 3, 0, "Gate1Opened", 8, -8, 2));
		this.portals.add(new Portal( 3.5, 0, "Gate1Opened", 8.5, -8, 2));
		this.portals.add(new Portal( 4, 0, "Gate1Opened", 9, -8, 2));
		this.portals.add(new Portal( 4.5, 0, "Gate1Opened", 9.5, -8, 2));
		this.portals.add(new Portal( 5, 0, "Gate1Opened", 10, -8, 2));
		
		this.portals.add(new Portal( 3, -9, "t2", 7, -1, 1));
		this.portals.add(new Portal( 3.5, -9, "t2", 7.5, -1, 1));
		this.portals.add(new Portal( 4, -9, "t2", 8, -1, 1));
		this.portals.add(new Portal( 4.5, -9, "t2", 8.5, -1, 1));
		this.portals.add(new Portal( 5, -9, "t2", 9, -1, 1));
		
		this.makeObstacles(1, 0, 1, 10);
		this.makeObstacles(2, -9, 13, 1);
		this.makeObstacles(2, 0, 1, 3);
		this.makeObstacles(6, 0, 10, 1);
		this.makeObstacles(15, 0, 1, 9);
		this.makeObstacles(7, -6, 1, 1);
		this.makeObstacles(13, -3, 1, 1);
		this.removeObstacles(3, -9);
		this.removeObstacles(4, -9);
		this.removeObstacles(5, -9);
		
		id="Gate2Opened";
		mapImage.setImage(new Image("file:image/map/Gate2Opened.png"));

		
		putItem(rune1);
		putItem(rune2);
		putItem(brokenPlate1);
		putItem(brokenPlate2);
		putItem(sign2Closed);
		
	}
}
