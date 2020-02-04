package storage;

import java.util.ArrayList;

public class Tile {

	//v�rdet som visas i rutan, om 0 = tom
	private int Value = 0;
	
	//potentiella v�rden som rutan skulle kunna bli utifr�n hur spelplanen ser ut nu
	private ArrayList<Integer> potentialValues = new ArrayList<Integer>();
	
	//n�r rutan skapas best�ms det om den redan har ett v�rde eller om den ska skapas tom.
	public Tile(int Value) {
		setValue(Value);
		
		if (Value == 0) {
			for (int i = 1; i <= 9; i++) {
				potentialValues.add(i);
			}
		}
		
	}
	
	//l�mnar ifr�n sig v�rdet p� value
	public int getValue() {
		return Value;
	}
	
	//best�mmer v�rdet p� value
	public void setValue(int a) {
		Value = a;
	}
	
	//testar om potentialvalue inneh�ller en int
	public boolean testPotential(int a) {
		return potentialValues.contains(a);
	}
	
	//tar bort en int fr�n potentialvalue
	public void removePotential(int a) {
		potentialValues.remove(a);
	}
	
	//om det finns ett v�rde kvar s� s�tter den value som det v�rdet
	public void oneValueLeft() {
		if (potentialValues.size() == 1) {
			setValue(potentialValues.get(0));
		}
	}
	
}
