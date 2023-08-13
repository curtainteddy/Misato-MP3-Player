package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;

@SuppressWarnings("unused")

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root, Color.BLACK);
		
		Image icon = new Image("misato mp3 player.png");
		
		
		stage.getIcons().add(icon);
		stage.setTitle("Main Stage");
		stage.setWidth(1000);
		stage.setHeight(700);
//		stage.setX(300);
//		stage.setY(70);
//		stage.setResizable(false);
//		stage.setFullScreen(true);
		
		stage.setScene(scene);
		stage.show();
	}
}  
 