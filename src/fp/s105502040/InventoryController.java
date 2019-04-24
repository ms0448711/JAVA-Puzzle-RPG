package fp.s105502040;

import java.util.ArrayList;

import fp.s105502040.item.Buket;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InventoryController {
	
	@FXML
	private Text i0;
	@FXML
	private Text i1;
	@FXML
	private Text i2;
	@FXML
	private Text i3;
	@FXML
	private Text i4;
	@FXML
	private Text i5;
	@FXML
	private Text i6;
	@FXML
	private Text i7;
	@FXML
	private ImageView invImage;
	@FXML
	private Rectangle invFrame;
	@FXML
	private Text itemText;
	
	private int position=0;
	private Stage primaryStage;
	private Scene originScene;
	private Text text;
	private ImageView dialogImage;
	public ArrayList<GameObject> items;
	public static Buket buketA = null;
	public static Buket buketB = null;
	
	
	InventoryController(Stage stage,Scene scene,Text text,ImageView dialogImage,ArrayList<GameObject> items){
		primaryStage=stage;
		originScene=scene;
		this.text=text;
		this.dialogImage=dialogImage;
		this.items=items;
	}
	
	@FXML
	private void initialize() {
		invImage.setImage(new Image("file:image/InvImage.jpg"));
	}
	
	public void setScene(Scene scene){
		scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

			@Override
			public void handle(KeyEvent event) {
				
				if(event.getCode() == KeyCode.UP){
					position-=2;
				}
				if(event.getCode() == KeyCode.DOWN){
					position+=2;
				}
				if(event.getCode() == KeyCode.RIGHT){
					position+=1;
				}
				if(event.getCode() == KeyCode.LEFT){
					position-=1;
				}
				position=(position+8)%8;
				invFrame.setTranslateX(20+(position%2)*400);
				invFrame.setTranslateY(180+(position/2)*60);
				if(event.getCode()==KeyCode.X){
					primaryStage.setScene(originScene);
				}
				if( event.getCode() == KeyCode.Z && getItemsText(position).getText()!=""){
					if(items.get(position).id== -5||items.get(position).id== -3){
						if(buketA != null){
							buketB=(Buket)items.get(position);
							while(buketA.contain!=0&&buketB.contain!= -buketB.id&&buketA!=buketB){
								buketA.contain--;
								buketB.contain++;
							}
							buketA=null;
							buketB=null;
						}
						else
							buketA =(Buket)items.get(position);
					}
					else{
						
						Mapping.currentGo=items.get(position);
						text.setText(Mapping.currentGo.texts.get(0));
						dialogImage.toFront();
						text.toFront();
						Mapping.interact();
						Mapping.comeFromInv = true;
						primaryStage.setScene(originScene);
					}

				}
				itemDisplay();
				
			}
			
		});
		
		
	}
	
	public Text getItemsText(int i){
		switch(i){
			case 0:
				return i0;
			case 1:
				return i1;
			case 2:
				return i2;
			case 3:
				return i3;
			case 4:
				return i4;
			case 5:
				return i5;
			case 6:
				return i6;
			case 7:
				return i7;
			default:
				return new Text("ERROR");
		}
	}
	
	public void itemDisplay(){
		if(buketA==null){
			if(getItemsText(position).getText()!=""){
				itemText.setText(items.get(position).invIntro);
				if(items.get(position).id<0){
					Buket b = (Buket)items.get(position);
					String s = new String("在桶子底部寫著「"+ b.contain+"L的X」");
					itemText.setText(s);
				}
			}
			else
				itemText.setText("");
			
		}
			
		else
			itemText.setText("已選擇"+-buketA.id+"L水桶");
	}
}
