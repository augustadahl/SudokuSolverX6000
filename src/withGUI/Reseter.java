package withGUI;

import java.util.ArrayList;

import javafx.scene.control.TextField;

public class Reseter {

	public static ArrayList<TextField> reset(ArrayList<TextField> tiles){
		for (int i = 0; i < tiles.size(); i++) {
			tiles.get(i).setEditable(true);
			tiles.get(i).setText("");
		}
		
		
		
		
		return tiles;
	}
	
}
