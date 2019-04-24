package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.BrokenPlate1;
import fp.s105502040.item.BrokenPlate2;
import fp.s105502040.item.Door2;
import fp.s105502040.item.Rune1;
import fp.s105502040.item.Rune2;
import fp.s105502040.item.Sign;
import javafx.scene.image.Image;

public class Gate2 extends Map{
	
	public Door2 door1 = new Door2(3,-9);
	public Door2 door2 = new Door2(4,-9);
	public Door2 door3 = new Door2(5,-9);
	public Rune1 rune1 = new Rune1(7,-6);
	public Rune2 rune2 = new Rune2(13,-3);
	public BrokenPlate1 brokenPlate1 = new BrokenPlate1(12,-6);
	public BrokenPlate2 brokenPlate2 = new BrokenPlate2(8,-3);
	public Sign sign2Closed = new Sign(2, -9,"Gate2",11,"¡uª`·Nµo¶Â¦aªO¡v...");
	
	Gate2(){
		this.portals.add(new Portal( 3, 0, "Gate1Opened", 8, -8, 2));
		this.portals.add(new Portal( 3.5, 0, "Gate1Opened", 8.5, -8, 2));
		this.portals.add(new Portal( 4, 0, "Gate1Opened", 9, -8, 2));
		this.portals.add(new Portal( 4.5, 0, "Gate1Opened", 9.5, -8, 2));
		this.portals.add(new Portal( 5, 0, "Gate1Opened", 10, -8, 2));
		
		this.makeObstacles(1, 0, 1, 10);
		this.makeObstacles(2, -9, 13, 1);
		this.makeObstacles(2, 0, 1, 3);
		this.makeObstacles(6, 0, 10, 1);
		this.makeObstacles(15, 0, 1, 9);
		this.makeObstacles(7, -6, 1, 1);
		this.makeObstacles(13, -3, 1, 1);
		
		
		id="Gate2";
		mapImage.setImage(new Image("file:image/map/Gate2.png"));
		
		putItem(door1);
		putItem(door2);
		putItem(door3);
		putItem(rune1);
		putItem(rune2);
		putItem(brokenPlate1);
		putItem(brokenPlate2);
		putItem(sign2Closed);
		
	}
}
