package solving_methods;

import algorithms.Calculations;
import storage.Tile;

public class BasicRules {

	public static Tile[][] testFor(Tile[][] sudokuboard) {

		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {

				if (sudokuboard[x][y].getValue() == 0) {

					for (int dig = 0; dig < 9; dig++) {
						if (sudokuboard[x][y].testPotential(sudokuboard[dig][y].getValue())) {
							sudokuboard[x][y].removePotential(sudokuboard[dig][y].getValue());
							Calculations.changed();
							System.out.println("removed " + sudokuboard[dig][y].getValue());
						}
					}

					for (int lod = 0; lod < 9; lod++) {
						if (sudokuboard[x][y].testPotential(sudokuboard[x][lod].getValue())) {
							sudokuboard[x][y].removePotential(sudokuboard[x][lod].getValue());
							Calculations.changed();
							System.out.println("removed " + sudokuboard[x][lod].getValue());
						}
					}

					if (x < 3) {
						if (y < 3) {

							for (int dig = 0; dig < 3; dig++) {
								for (int lod = 0; lod < 3; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						} else if (y > 5) {

							for (int dig = 0; dig < 3; dig++) {
								for (int lod = 6; lod < 9; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						} else {

							for (int dig = 0; dig < 3; dig++) {
								for (int lod = 3; lod < 6; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						}
					} else if (x > 5) {

						if (y < 3) {

							for (int dig = 6; dig < 9; dig++) {
								for (int lod = 0; lod < 3; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						} else if (y > 5) {

							for (int dig = 6; dig < 9; dig++) {
								for (int lod = 6; lod < 9; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						} else {

							for (int dig = 6; dig < 9; dig++) {
								for (int lod = 3; lod < 6; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						}

					} else {

						if (y < 3) {

							for (int dig = 3; dig < 6; dig++) {
								for (int lod = 0; lod < 3; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						} else if (y > 5) {

							for (int dig = 3; dig < 6; dig++) {
								for (int lod = 6; lod < 9; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						} else {

							for (int dig = 3; dig < 6; dig++) {
								for (int lod = 3; lod < 6; lod++) {
									if (sudokuboard[x][y].testPotential(sudokuboard[dig][lod].getValue())) {
										sudokuboard[x][y].removePotential(sudokuboard[dig][lod].getValue());
										Calculations.changed();
									}
								}
							}

						}

					}

					// lägg till för boxen

				}
			}
		}

		return sudokuboard;

	}

}
