package withGUI;

import java.util.ArrayList;

import algorithms.Calculations;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import storage.Tile;

public class GUI extends Application {

	Tile[][] sudokuBoard = new Tile[9][9];
	int scale = 50;
	ArrayList<TextField> tiles = new ArrayList<TextField>();
	Group root = new Group();
	
	
	public void start(Stage primaryStage) throws Exception {
		
		Scene scene = new Scene(root, scale * 9 + scale / 10, scale * 10 + scale / 10);
		primaryStage.setScene(scene);
		primaryStage.show();

		
		//skapar alla rutor och sprider dem över planen
		int index = 0;
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {

				tiles.add(new TextField());
				tiles.get(index).setMinWidth(scale);
				tiles.get(index).setMaxWidth(scale);
				tiles.get(index).setMinHeight(scale);
				tiles.get(index).setMaxHeight(scale);

				tiles.get(index).setTranslateX(scale * x);
				tiles.get(index).setTranslateY(scale * y);

				if (x % 3 == 0) {
					tiles.get(index).setTranslateX(tiles.get(index).getTranslateX() + scale / 10);
				}
				if (y % 3 == 0) {
					tiles.get(index).setTranslateY(tiles.get(index).getTranslateY() + scale / 10);
				}

				root.getChildren().add(tiles.get(index));

				index++;
			}
		}

		Button calcButton = new Button();
		calcButton.setText("Calculate");
		calcButton.setMinWidth(scale*2);
		calcButton.setMaxWidth(scale*2);
		calcButton.setMinHeight(scale);
		calcButton.setMaxHeight(scale);
		calcButton.setTranslateX(scale / 10);
		calcButton.setTranslateY(scale*9);
		
		Button restartButton = new Button();
		restartButton.setText("Restart");
		restartButton.setMinWidth(scale*2);
		restartButton.setMaxWidth(scale*2);
		restartButton.setMinHeight(scale);
		restartButton.setMaxHeight(scale);
		restartButton.setTranslateX(scale*7);
		restartButton.setTranslateY(scale*9);
		root.getChildren().addAll(calcButton, restartButton);
		
		calcButton.setOnAction(e -> Calculations.calculate(tiles));
		restartButton.setOnAction(e -> Reseter.reset(tiles));
		
		//kollar om det är något annat än 0-9 och tar bort det från rutan.
		AnimationTimer at = new AnimationTimer() {

			@Override
			public void handle(long now) {

				tiles = TestInputValue.testIn(tiles);
			}
		};

		at.start();

	}

	public static void main(String[] args) {
		launch();
	}

	
	
}
