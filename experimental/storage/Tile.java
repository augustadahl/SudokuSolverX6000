package storage;

import java.util.ArrayList;

public class Tile {

	//värdet som visas i rutan, om 0 = tom
	private int Value = 0;
	
	//potentiella värden som rutan skulle kunna bli utifrån hur spelplanen ser ut nu
	private ArrayList<Integer> potentialValues = new ArrayList<Integer>();
	
	//när rutan skapas bestäms det om den redan har ett värde eller om den ska skapas tom.
	public Tile(int Value) {
		setValue(Value);
		
		if (Value == 0) {
			for (int i = 1; i <= 9; i++) {
				potentialValues.add(i);
			}
		}
		
	}
	
	//lämnar ifrån sig värdet på value
	public int getValue() {
		return Value;
	}
	
	//bestämmer värdet på value
	public void setValue(int a) {
		Value = a;
	}
	
	//testar om potentialvalue innehåller en int
	public boolean testPotential(int a) {
		return potentialValues.contains(a);
	}
	
	//tar bort en int från potentialvalue
	public void removePotential(int a) {
		potentialValues.remove(a);
	}
	
	//om det finns ett värde kvar så sätter den value som det värdet
	public void oneValueLeft() {
		if (potentialValues.size() == 1) {
			setValue(potentialValues.get(0));
		}
	}
	
}
