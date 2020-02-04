package storage;

public class Board {
	
	Tile[][] sudokuBoard = new Tile[9][9];
	
	
	//omvandlar in-data till användbar data.
	public Board(int[][] grid) {
		
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				sudokuBoard[i][j] = new Tile(grid[i][j]);
			}
		}
		
		
		
		
		
		
	}
	
	
	
}
