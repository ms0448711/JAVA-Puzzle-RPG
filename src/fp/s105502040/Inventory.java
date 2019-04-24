package fp.s105502040;

import java.io.IOException;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Inventory { 
	public Scene inventoryScene;
	private Scene originScene;
	private Stage primaryStage;
	public FXMLLoader fxmlInventory = new FXMLLoader(getClass().getResource("inventory.fxml"));
	public ArrayList<GameObject> items = new ArrayList<GameObject>();
	public static InventoryController controller;
	public static int inventoryCount=0;
	private Text text;
	private ImageView dialogImage;
	

	
	Inventory(Stage primaryStage,Scene originScene,Text text,ImageView dialogImage) throws IOException {
		this.primaryStage=primaryStage;
		this.originScene=originScene;
		this.text=text;
		this.dialogImage=dialogImage;
		controller = new InventoryController(primaryStage,originScene,text,dialogImage,items);
		
		fxmlInventory.setController(controller);
		inventoryScene = new Scene( (Parent)fxmlInventory.load(), 816, 624);
		controller.setScene(inventoryScene);
	}
	
	public void addItem(GameObject go){
		items.add(go);
		controller.getItemsText(inventoryCount++).setText(go.name);;
	}
	

	

}
