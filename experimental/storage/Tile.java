package storage;

import java.util.ArrayList;

public class Tile {

	private int Value = 0;
	private ArrayList<Integer> potentialValues = new ArrayList<Integer>();
	
	public Tile(int Value) {
		this.Value = Value;
		
		if (Value == 0) {
			for (int i = 1; i <= 9; i++) {
				potentialValues.add(i);
			}
		}
		
	}
	
	public int getValue() {
		return Value;
	}
	
	public void setValue(int a) {
		Value = a;
	}
	
	public boolean testPotential(int a) {
		return true;
	}
	
	//potentialValue contains
	
	//potentialValue remove
	
}
