package storage;

public class Board {
	
	Tile[][] sudokuBoard = new Tile[9][9];
	
	
	//omvandlar in-data till användbar data.
	public Board(int[][] grid) {
		
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				sudokuBoard[x][y] = new Tile(grid[x][y]);
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
