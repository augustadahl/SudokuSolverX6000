package withGUI;

import java.util.ArrayList;

import javafx.scene.control.TextField;

// tar in en array med textrutor och testar deras värde. Tillåter enbart enstaka heltal 0-9 annars tar den bort värdet.

public class TestInputValue {

	public static ArrayList<TextField> testIn(ArrayList<TextField> tiles) {
		for (int i = 0; i < tiles.size(); i++) {
			switch (tiles.get(i).getText()) {
			case "1":

				break;
			case "2":

				break;
			case "3":

				break;
			case "4":

				break;
			case "5":

				break;
			case "6":

				break;
			case "7":

				break;
			case "8":

				break;
			case "9":

				break;
			default:
				tiles.get(i).setText("");
				break;
			}
		}
		return tiles;
	}

}


//add interference protection!