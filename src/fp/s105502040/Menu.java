package fp.s105502040;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.util.Duration;



public class Menu {
	@FXML
	private Button startGame;
	@FXML
	private Button closeGame;

	@FXML
	private ImageView menuImage;
	
	
	public static Mapping mapping = new Mapping();
	private FXMLLoader fxmlMap = new FXMLLoader(getClass().getResource("map.fxml"));
	private Scene mapScene; 
	private Inventory inventory;
	public static MediaPlayer caveSong = new MediaPlayer( new Media( new File( "sound/Rabi-Ribi OST Unfamiliar Place.mp3").toURI().toString()));
	public static MediaPlayer woodSong = new MediaPlayer( new Media( new File( "sound/Rabi-Ribi OST Sky-High Bridge.mp3").toURI().toString()));
	public static MediaPlayer homeSong = new MediaPlayer( new Media( new File( "sound/®É¶¡¯«·µ_002.mp3").toURI().toString()));
	
	private Stage thePrimaryStage;
	
	@FXML
	private void initialize(){
		
		menuImage.setImage ( new Image ("file:image/menu.jpg") );
		mapping.setStage(thePrimaryStage);
		
		caveSong.setOnEndOfMedia(new Runnable(){
			public void run() {
				caveSong.seek(Duration.ZERO);
			}
		});
		woodSong.setOnEndOfMedia(new Runnable(){
			public void run() {
				woodSong.seek(Duration.ZERO);
			}
		});
		startGame.setOnAction(new EventHandler<ActionEvent> () {

			@Override
			public void handle(ActionEvent event) {
					caveSong.play();
					thePrimaryStage.setScene(mapScene);
					mapping.setScene(mapScene);
				}
			});
		closeGame.setOnAction(new EventHandler<ActionEvent> () {

			@Override
			public void handle(ActionEvent event) {
					thePrimaryStage.close();
					
				}
			});
		
	}
	
	Menu(Stage stage){
		this.thePrimaryStage=stage;
		fxmlMap.setController(mapping);	
		try{
		
		mapScene = new Scene( (Parent)fxmlMap.load(), 816, 624);
		}catch(IOException e){
			
		}
	}
	


}
