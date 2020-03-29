package solving_methods;

import algorithms.Calculations;
import storage.Tile;

public class SingleCandidate {

	public static Tile[][] testFor(Tile[][] sudokuboard) {
		
		
		for (int y = 0; y < sudokuboard.length; y++) {
			for (int x = 0; x < sudokuboard.length; x++) {
				
				if (sudokuboard[x][y].getValue() == 0) {
					int old = sudokuboard[x][y].getValue();
					sudokuboard[x][y].oneValueLeft();
					if (old != sudokuboard[x][y].getValue()) {
						Calculations.changed();
					}	
				}
			}
		}

		return sudokuboard;
		
	}
	
}







































