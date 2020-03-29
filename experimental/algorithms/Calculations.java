package algorithms;

import java.util.ArrayList;
import java.util.Scanner;

import javafx.scene.control.TextField;
import storage.Tile;

public class Calculations {

	static Tile[][] sudokuBoard = new Tile[9][9];

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

		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				System.out.print(sudokuBoard[y][x].getValue() + " ");
			}
			System.out.println();
		}

		return tiles;
	}

}
