package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

@SuppressWarnings("unused")

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Group root = new Group();
		Scene scene = new Scene(root,700,700, Color.PINK);
		
		Image icon = new Image("misato mp3 player.png");
		stage.getIcons().add(icon);
		
		stage.setTitle("Main Stage");
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
//		Text text = new Text();
//		text.setText("Play");
//		text.setX(50);
//		text.setY(50);
//		text.setFont(Font.font("Agency FB",50));
//		text.setFill(Color.WHITE);
//		
//		Line line = new Line();
//		line.setStartX(300);
//		line.setStartY(200);
//
//		line.setEndX(-500);
//		line.setEndY(600);
//		line.setStrokeWidth(5);
//		line.setStroke(Color.ANTIQUEWHITE);
//		line.setOpacity(0.9);
//		line.setRotate(45);
//		
//		Rectangle rectangle = new Rectangle();
//		rectangle.setX(100);
//		rectangle.setY(100);
//		rectangle.setWidth(100);
//		rectangle.setHeight(100);
//		rectangle.setFill(Color.ANTIQUEWHITE);
//		rectangle.setStrokeWidth(10);
//		rectangle.setStroke(Color.BLACK);
//		
//		ImageView imageview = new ImageView("misato mp3 player.png");
//		imageview.setX(300);
//		imageview.setY(300);
//		imageview.setFitWidth(100);
//		imageview.setFitHeight(100);
//		
//		root.getChildren().add(text);
//		root.getChildren().add(line);
//		root.getChildren().add(rectangle);
//		root.getChildren().add(imageview);
//		
//		
//		Stage Settings
//		----------------
//		stage.setWidth(1000);
//		stage.setHeight(700);
//		stage.setX(300);
//		stage.setY(70);
//		stage.setResizable(false);
//		stage.setFullScreen(true);
//		stage.setFullScreenExitHint("Press Q to Quit");
//		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		
	}
}  
 