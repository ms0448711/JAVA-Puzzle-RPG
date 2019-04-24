package fp.s105502040;

import java.util.ArrayList;

import fp.s105502040.map.MapUtility;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class StoneCode {
	
	@FXML
	public Text text1;
	@FXML
	public Text text2;
	@FXML
	public Text text3;
	@FXML
	public Text text4;
	@FXML
	public Text text5;
	@FXML
	public Rectangle stoneFrame;
	@FXML
	public ImageView stoneImage;
	
	public int position = 0;
	public ArrayList<String> fiveElementSequence = new ArrayList<String>();
	public int[] stoneX = {458,598,550,368,324};
	public int[] stoneY = {158,267,415,420,264};
	
	public static boolean correct = false;
	
	@FXML
	private void initialize(){
		fiveElementSequence.add("金");
		fiveElementSequence.add("木");
		fiveElementSequence.add("水");
		fiveElementSequence.add("火");
		fiveElementSequence.add("土");
		
		stoneImage.setImage(new Image("file:image/stoneCode.png"));
	}
	
	public void setScene(Scene scene){
		scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode()==KeyCode.UP){
					switch(position){
					case 0:
						text1.setText(changeElement(text1.getText(),1));
						break;
					case 3:
						text2.setText(changeElement(text2.getText(),1));
						break;
					case 1:
						text3.setText(changeElement(text3.getText(),1));
						break;
					case 4:
						text4.setText(changeElement(text4.getText(),1));
						break;
					case 2:
						text5.setText(changeElement(text5.getText(),1));
						break;
					}
				}
				if(event.getCode()==KeyCode.DOWN){
					switch(position){
					case 0:
						text1.setText(changeElement(text1.getText(),-1));
						break;
					case 3:
						text2.setText(changeElement(text2.getText(),-1));
						break;
					case 1:
						text3.setText(changeElement(text3.getText(),-1));
						break;
					case 4:
						text4.setText(changeElement(text4.getText(),-1));
						break;
					case 2:
						text5.setText(changeElement(text5.getText(),-1));
						break;
					}
				}
				if(event.getCode()==KeyCode.LEFT){
					stoneFrame.setTranslateX(stoneX[(position-1+5)%5]);
					stoneFrame.setTranslateY(stoneY[(position-1+5)%5]);
					position=(position-1+5)%5;
					
				}
				if(event.getCode()==KeyCode.RIGHT){
					stoneFrame.setTranslateX(stoneX[(position+1+5)%5]);
					stoneFrame.setTranslateY(stoneY[(position+1+5)%5]);
					position=(position+1+5)%5;
				}
				if(event.getCode()==KeyCode.Z){
					if(( text1.getText()+text2.getText()+text3.getText()+text4.getText()+text5.getText() ).equals("木金火水土"))
						correct = true;
					if(correct){
						Menu.mapping.text.setText("石碑消失了...");
						Menu.mapping.lastMap=Menu.mapping.currentMap;
						Menu.mapping.currentMap=Menu.mapping.mapUtility.getMap("Home");
						Menu.mapping.refreshMap();
						MapUtility.homeClosedORnot = false;
					}	
					else
						Menu.mapping.text.setText("甚麼也沒發生");
					Menu.mapping.dialogImage.toFront();
					Menu.mapping.text.toFront();
					Menu.mapping.lock=true;
					Mapping.stage.setScene(Mapping.mapScene);
				}
				
			}
			
		});
	}
	
	public String changeElement(String str, int direction){
		for(int i=0;i<5;i++){
			if(fiveElementSequence.get(i).equals(str)){
				return fiveElementSequence.get( (i+direction+5)%5 );
			}
		}
		return "";
	}
}
