package fp.s105502040;

import java.util.ArrayList;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class Map {
	public ArrayList<Portal> portals=new ArrayList<Portal>();
	public ArrayList<Obstacle> obstacles=new ArrayList<Obstacle>();
	public ArrayList<GameObject> gameObjects=new ArrayList<GameObject>();
	public ImageView mapImage=new ImageView();
	public String id;
	
	
	public void makeObstacles(double X,double Y,double width,double height){
		for(double i=X;i<X+width;i++)
			for(double j=Y;j>Y-height;j--)
				this.obstacles.add(new Obstacle(i,j));
	}
	
	public void removeObstacles(double X, double Y){
		for(int i=0;i<this.obstacles.size();i++)
			if(this.obstacles.get(i).X==X&&this.obstacles.get(i).Y==Y){
				this.obstacles.remove(i);
				break;
			}
				
	}
	
	public void putItem(GameObject go){
		gameObjects.add(go);
		go.setTranslateX(go.X*48);
		go.setTranslateY(go.Y*48);
		if(go.pickable)
		this.obstacles.add(go.obstacle);
	}
	
	
}
