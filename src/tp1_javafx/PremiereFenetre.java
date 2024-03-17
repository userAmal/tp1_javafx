package ex1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PremiereFenetre extends Application {
	 @Override
	 public void start(Stage primaryStage) {
	
		 Group root = new Group();
		 Scene scene = new Scene(root, 300, 250, Color.WHITE);
		 Rectangle r1 = new Rectangle(150,20,52,50);
		 Line l1 = new Line (50,100,50,40);
		 Circle c1 = new Circle (80,80,20);
		 root.getChildren().addAll(r1,l1,c1);
	 primaryStage.setTitle("Ma première fenêtre");
	 primaryStage.setScene(scene);
	 primaryStage.show();
	 }
	 public static void main(String[] args) {
	 launch(args);
	 }
	}