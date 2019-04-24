package fp.s105502040;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class FinalScene {
	@FXML
	private Button closeGame;

	@FXML
	private ImageView menuImage;
	
	@FXML
	private void initialize(){
		menuImage.setImage ( new Image ("file:image/finalScene.png") );
		
		closeGame.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				Menu.mapping.stage.close();
				
			}
			
		});
	}
	
	public void setScene(Scene scene){
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>(){
	    	@Override
	      public void handle(KeyEvent event) {
	    		if(event.getCode()==KeyCode.ESCAPE){
	    			Menu.mapping.stage.close();
	    		}
	    	}
		});
	}
}
