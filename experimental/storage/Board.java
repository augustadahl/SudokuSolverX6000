package storage;

public class Board {
	
	Tile[][] sudokuBoard = new Tile[9][9];
	
	
	//omvandlar in-data till användbar data.
	public Board(int[][] grid) {
		
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				sudokuBoard[x][y] = new Tile(grid[x][y]);
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
