package fp.s105502040.map;

import fp.s105502040.Map;
import fp.s105502040.Portal;
import fp.s105502040.item.Buket3X;
import fp.s105502040.item.Buket5X;
import fp.s105502040.item.Door1;
import fp.s105502040.item.DryWater;
import fp.s105502040.item.Lighter;
import fp.s105502040.item.Sign1Closed;
import javafx.scene.image.Image;

public class Gate1 extends Map{
	
	public Buket5X buket5x = new Buket5X( 5, -6,new Image("file:image/item/buket.png"), "5L¤ô±í");
	public Buket3X buket3x = new Buket3X( 14, -8,new Image("file:image/item/buket.png"), "3L¤ô±í");
	public Door1 door0 = new Door1( 8, -9);
	public Door1 door1 = new Door1( 9, -9);
	public Door1 door2 = new Door1( 10, -9);
	public Sign1Closed sign1Closed = new Sign1Closed( 7, -9);
	public DryWater drywater0 = new DryWater(4,-7);
	public DryWater drywater1 = new DryWater(4,-8);
	public DryWater drywater2 = new DryWater(4,-9);
	public DryWater drywater3 = new DryWater(5,-7);
	public DryWater drywater4 = new DryWater(5,-8);
	public DryWater drywater5 = new DryWater(5,-9);
	
	
	Gate1(){
		this.portals.add(new Portal(0,-1,"t1",15,-6,3));
		this.portals.add(new Portal(0,-1.5,"t1",15,-6.5,3));
		this.portals.add(new Portal(0,-2,"t1",15,-7,3));
		
		this.makeObstacles(0, 0, 17, 1);
		this.makeObstacles(0, -3, 4, 9);
		this.makeObstacles(4, -9, 12, 2);
		this.makeObstacles(15, -2, 1, 12);
		this.makeObstacles(13, -1, 2, 1);
		this.makeObstacles(4, -5, 2, 1);
		this.makeObstacles(7, -3, 1, 2);
		this.makeObstacles(7, -6, 1, 1);
		this.makeObstacles(11, -3, 1, 2);
		this.makeObstacles(11, -6, 1, 2);
		
		id="Gate1";
		mapImage.setImage(new Image("file:image/map/Gate1.png"));
		
		putItem(buket5x);
		putItem(buket3x);
		putItem(door0);
		putItem(door1);
		putItem(door2);
		putItem(sign1Closed);
		putItem(drywater0);
		putItem(drywater1);
		putItem(drywater2);
		putItem(drywater3);
		putItem(drywater4);
		putItem(drywater5);
	}
	
	
}
