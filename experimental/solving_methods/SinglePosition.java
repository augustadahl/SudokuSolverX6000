package solving_methods;

import algorithms.Calculations;
import storage.Tile;

public class SinglePosition {

	public static Tile[][] testFor(Tile[][] sudokuboard) {

		boolean exit = false;
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				if (sudokuboard[x][y].getValue() == 0) {
					for (int currentpotential = 0; currentpotential < sudokuboard[x][y]
							.potentialLength(); currentpotential++) {

//						System.out.println("current potential = " + currentpotential);
//						System.out.println("current potential value = " + sudokuboard[x][y].getPotentialvalue(currentpotential));

						boolean hasPotDig = false;
						for (int dig = 0; dig < 9; dig++) {
							if (sudokuboard[dig][y].getValue() == 0 && dig != x) {
								if (sudokuboard[dig][y]
										.testPotential(sudokuboard[x][y].getPotentialvalue(currentpotential))) {
									hasPotDig = true;
								}
							}

						}

						boolean hasPotLod = false;
						for (int lod = 0; lod < 9; lod++) {
							if (sudokuboard[x][lod].getValue() == 0 && lod != y) {
								if (sudokuboard[x][lod]
										.testPotential(sudokuboard[x][y].getPotentialvalue(currentpotential))) {
									hasPotLod = true;					
								}
							}

						}

						boolean hasPotBox = false;
						if (x < 3) {
							if (y < 3) {

								for (int dig = 0; dig < 3; dig++) {
									for (int lod = 0; lod < 3; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							} else if (y > 5) {

								for (int dig = 0; dig < 3; dig++) {
									for (int lod = 6; lod < 9; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							} else {

								for (int dig = 0; dig < 3; dig++) {
									for (int lod = 3; lod < 6; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							}
						} else if (x > 5) {

							if (y < 3) {

								for (int dig = 6; dig < 9; dig++) {
									for (int lod = 0; lod < 3; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							} else if (y > 5) {

								for (int dig = 6; dig < 9; dig++) {
									for (int lod = 6; lod < 9; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							} else {

								for (int dig = 6; dig < 9; dig++) {
									for (int lod = 3; lod < 6; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							}

						} else {

							if (y < 3) {

								for (int dig = 3; dig < 6; dig++) {
									for (int lod = 0; lod < 3; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							} else if (y > 5) {

								for (int dig = 3; dig < 6; dig++) {
									for (int lod = 6; lod < 9; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							} else {

								for (int dig = 3; dig < 6; dig++) {
									for (int lod = 3; lod < 6; lod++) {
										if (sudokuboard[dig][lod].getValue() == 0 && dig != x && lod != y) {
											if (sudokuboard[dig][lod].testPotential(
													sudokuboard[x][y].getPotentialvalue(currentpotential))) {
												hasPotBox = true;

											}
										}
									}
								}

							}

						}

						if (!hasPotBox || !hasPotDig || !hasPotLod) {
							sudokuboard[x][y].setValue(sudokuboard[x][y].getPotentialvalue(currentpotential));
							Calculations.changed();
							System.out.println(sudokuboard[x][y].getPotentialvalue(currentpotential));
							System.out.println(hasPotDig);
							System.out.println(hasPotLod);
							System.out.println(hasPotBox);
							exit = true;
							break;

						}

					}

				}

				if (exit) {
					break;
				}

			}
			if (exit) {
				break;
			}
		}

		return sudokuboard;
	}

}
