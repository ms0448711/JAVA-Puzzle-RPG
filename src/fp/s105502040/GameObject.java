package fp.s105502040;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class GameObject extends ImageView{
	
	public double X;
	public double Y;
	public String name;
	public boolean taken=false;
	public boolean pickable=false;
	public String atMap;
	public int id;
	public Obstacle obstacle;
	public ArrayList<String> texts = new ArrayList<String> ();
	public GameEvent event;
	public String invIntro;
	
	
	protected GameObject(double x,double y,Image image,String name){
		X=x;
		Y=y;
		this.setImage(image);
		this.name=name;
		this.setFitWidth(48);
		this.setFitHeight(48);
		this.setLayoutY(576);
		this.toFront();
		this.obstacle = new Obstacle(x,y);
	}
	
	protected GameObject(double x,double y){
		X=x;
		Y=y;
	}
	


	
}
