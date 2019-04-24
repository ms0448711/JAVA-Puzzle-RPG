package fp.s105502040;

public class Portal {
	public double X;
	public double Y;
	public String toMap;
	public double toX;
	public double toY;
	public int direction;
	
	public Portal(double x, double y, String toMap, double toX, double toY,int direction){
		this.X = x;
		this.Y = y;
		this.toMap = toMap;
		this.toX = toX;
		this.toY = toY;
		this.direction = direction;
	}
	
	public void resetWood(){
		switch((int)(Math.random()*3)){
		case 0:
			this.toX = 2;
			this.toY = -6;
			this.direction = 4;
			break;
		case 1:
			this.toX = 14;
			this.toY = -6;
			this.direction = 3;
			break;
		case 2:
			this.toX = 8;
			this.toY = -10;
			this.direction = 2;
			break;
		}
	}
	
	public void resetWoods(){
		switch((int)(Math.random()*4)){
		case 0:
			this.toX = 2;
			this.toY = -6;
			this.direction = 4;
			break;
		case 1:
			this.toX = 14;
			this.toY = -6;
			this.direction = 3;
			break;
		case 2:
			this.toX = 8;
			this.toY = -10;
			this.direction = 2;
			break;
		case 3:
			this.toX = 8;
			this.toY = -2;
			this.direction = 1;
			break;
		}
	}
	
	public void setMap(String changeMap){
		this.toMap = changeMap;
	}
}
