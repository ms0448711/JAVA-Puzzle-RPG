package fp.s105502040;

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

public class EnterScene1 {
	@FXML
	public ImageView enterImage;
	@FXML
	public Text enterText1;
	@FXML
	public Text enterText2;
	@FXML
	public Text enterText3;
	@FXML
	public Text enterText4;
	@FXML
	public Text enterText5;
	@FXML
	public Rectangle enterFrame1;
	
	public int position = 0;
	public boolean answerJudgement = false;
	public String answer;
	
	public EnterScene1(String answer){
		this.answer = answer;
		//this.answer="AAAAA";
	}
	
	
	@FXML
	private void initialize(){
		enterImage.setImage(new Image("file:image/EnterImage1.png"));
		
	}
	
	public void setScene(Scene scene){
		scene.setOnKeyPressed(new EventHandler<KeyEvent>(){

			@Override
			public void handle(KeyEvent event) {
				if(event.getCode()==KeyCode.UP){
					switch(position){
					case 0:
						enterText1.setText( charTransformer(enterText1.getText(), 1) );
						break;
					case 1:
						enterText2.setText( charTransformer(enterText2.getText(), 1) );
						break;
					case 2:
						enterText3.setText( charTransformer(enterText3.getText(), 1) );
						break;
					case 3:
						enterText4.setText( charTransformer(enterText4.getText(), 1) );
						break;
					case 4:
						enterText5.setText( charTransformer(enterText5.getText(), 1) );
						break;
					}
				}
				if(event.getCode()==KeyCode.DOWN){
					switch(position){
					case 0:
						enterText1.setText( charTransformer(enterText1.getText(), -1) );
						break;
					case 1:
						enterText2.setText( charTransformer(enterText2.getText(), -1) );
						break;
					case 2:
						enterText3.setText( charTransformer(enterText3.getText(), -1) );
						break;
					case 3:
						enterText4.setText( charTransformer(enterText4.getText(), -1) );
						break;
					case 4:
						enterText5.setText( charTransformer(enterText5.getText(), -1) );
						break;
					}
				}
				if(event.getCode()==KeyCode.LEFT){
					if(position==0){
						enterFrame1.setTranslateX(587);
						position=4;
					}
					else{
						enterFrame1.setTranslateX(enterFrame1.getTranslateX()-120);
						position--;
					}
						
				}
				if(event.getCode()==KeyCode.RIGHT){
					if(position==4){
						enterFrame1.setTranslateX(107);
						position=0;
					}
					else{
						enterFrame1.setTranslateX(enterFrame1.getTranslateX()+120);
						position++;
					}
				}
				if(event.getCode()==KeyCode.Z||event.getCode()==KeyCode.ENTER){
					if(answer.equals(enterText1.getText()+enterText2.getText()+enterText3.getText()+enterText4.getText()+enterText5.getText()))
						answerJudgement=true;
					if(answerJudgement){
						Menu.mapping.text.setText("機關門發生了劇烈震動，似乎可以前進了");
						Menu.mapping.dialogImage.toFront();
						Menu.mapping.text.toFront();
						Menu.mapping.lastMap=Menu.mapping.currentMap;
						Menu.mapping.currentMap=Menu.mapping.mapUtility.getMap("Gate2Opened");
						Menu.mapping.mapUtility.getMap("Gate1Opened").portals.get(3).toMap="Gate2Opened";
						Menu.mapping.mapUtility.getMap("Gate1Opened").portals.get(4).toMap="Gate2Opened";
						Menu.mapping.mapUtility.getMap("Gate1Opened").portals.get(5).toMap="Gate2Opened";
						Menu.mapping.mapUtility.getMap("Gate1Opened").portals.get(6).toMap="Gate2Opened";
						Menu.mapping.mapUtility.getMap("Gate1Opened").portals.get(7).toMap="Gate2Opened";
						Menu.mapping.refreshMap();
					}
					else{
						Menu.mapping.text.setText("甚麼也沒發生");
						Menu.mapping.dialogImage.toFront();
						Menu.mapping.text.toFront();
					}
					Menu.mapping.lock=true;
					Mapping.stage.setScene(Mapping.mapScene);
				}
				
			}
			
		}
				);
	}
	
	public String  charTransformer(String str,int direction){
		String sequence = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		for(int i=0;i<sequence.length();i++){
			if(sequence.charAt(i)==str.charAt(0))
				return sequence.charAt((i+direction+26)%26)+"";
		}
		return sequence.charAt(0)+"";
	}
}