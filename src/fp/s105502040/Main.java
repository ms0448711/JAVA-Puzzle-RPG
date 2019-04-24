package fp.s105502040;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static Scene scene00;
	
	@Override
	public void start (Stage primaryStage) throws Exception{
		FXMLLoader fxmlMenu = new FXMLLoader(getClass().getResource("menu.fxml"));
		Menu menu = new Menu(primaryStage);
		fxmlMenu.setController(menu);
		Parent root = fxmlMenu.load();
		primaryStage.setTitle("ธีทา");
		scene00 = new Scene ( root, 816, 624 );
		primaryStage.setScene(scene00);
		primaryStage.show();
    }
	

    public static void main(String[] args) {
	launch(args);
    }
    
}