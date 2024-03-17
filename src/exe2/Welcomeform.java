package exe2;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Welcomeform extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("JavaFX Welcome");
		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setAlignment(Pos.TOP_CENTER);
		Insets p = new Insets(25);
		gp.setPadding(p);
		Scene scene = new Scene(gp, 300, 275);
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		gp.add(scenetitle, 0, 0, 2, 1);
		Label userName = new Label("User Name:");
		gp.add(userName, 0, 1);
		TextField userTextField = new TextField();
		gp.add(userTextField, 1, 1);
		Label pw = new Label("password :");
		gp.add(pw, 0, 2);
		PasswordField pwBox = new PasswordField();
		gp.add(pwBox, 1, 2);
		Button btn = new Button("Sign in");
		HBox hbBtn = new HBox(10);
		hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		gp.add(hbBtn, 1, 4);
		TextField actiontarget = new TextField();
		gp.add(actiontarget, 1, 6);

		Button b2 = new Button("Exit");
		HBox h2 = new HBox(10);
		gp.setAlignment(Pos.BOTTOM_LEFT);
		h2.getChildren().add(b2);
		gp.add(h2, 0, 4);
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				if (pwBox.getText().compareTo("123") == 0) {
					actiontarget.setText("Sign in button pressed");
				} else {
					actiontarget.setText("mdp incorrecte ");
				}
			}
		});
		b2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				Platform.exit();
			}
		});

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
