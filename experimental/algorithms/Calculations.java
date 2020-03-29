package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.control.TextField;
import solving_methods.BasicRules;
import solving_methods.SingleCandidate;
import storage.Tile;

public class Calculations {

	static Tile[][] sudokuBoard = new Tile[9][9];
	static boolean change = true;
	
	public static ArrayList<TextField> calculate(ArrayList<TextField> tiles) {

		for (int i = 0; i < tiles.size(); i++) {
			tiles.get(i).setEditable(false);
		}

		int index = 0;
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				if (tiles.get(index).getText().equals("")) {
					sudokuBoard[x][y] = new Tile(0);
				} else {
					sudokuBoard[x][y] = new Tile(Integer.parseInt(tiles.get(index).getText()));
				}
				index++;
			}
		}

		while (change) {
			change = false;
			
			SingleCandidate.testFor(sudokuBoard);
			
			BasicRules.testFor(sudokuBoard);
			
			
			
		}
		
		
		
		
		
		
		
		
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				System.out.print(sudokuBoard[y][x].getValue() + " ");
			}
			System.out.println();
		}

//		convert back to tiles
		
		return tiles;
	}

	public static void changed() {
		change = true;
	}


	
}
