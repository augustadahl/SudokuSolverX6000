package solving_methods;

import storage.Tile;

public class SingleCandidate {

	public static Tile[][] testFor(Tile[][] SB) {
		
		
		for (int y = 0; y < SB.length; y++) {
			for (int x = 0; x < SB.length; x++) {
				SB[x][y].oneValueLeft();
			}
		}

		return SB;
		
	}
	
}







































