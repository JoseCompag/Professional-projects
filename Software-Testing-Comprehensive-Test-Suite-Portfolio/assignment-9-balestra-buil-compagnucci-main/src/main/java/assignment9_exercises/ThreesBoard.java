package assignment9_exercises;

import java.util.Random;

/**
 * 
 * Partially implemented ThreesBoard Class for threes game
 * 
 */

public class ThreesBoard {

	/*
	 * Stores the game board. Indices for tiles must go from 1 to 4, both for rows
	 * and for columns.
	 */
	private ThreesTile[][] elements;

	/*
	 * Number of rows in the board. Should be constantly 4
	 */
	public static final int ROWS = 4;

	/*
	 * Number of columns in the board. Should be constantly 4
	 */
	public static final int COLUMNS = 4;

	public RandomGenerator generator = new RandomValueGenerator();

	/**
	 * Build a board with ROW number of rows and COLUMNS number of columns with
	 * total_tiles_to_set
	 * number of tiles set randomly (with valid tiles values)
	 * 
	 * @param totalTiles is the number of tiles set randomly by the constructor
	 */
	public ThreesBoard(int totalTiles) {
		// Creates a board of 4x4 with free tiles.
		elements = new ThreesTile[ROWS][COLUMNS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				elements[i][j] = new ThreesTile();
			}
		}
		// select 9 positions, and set with random numbers from 1, 2 or 3.
		for (int setTiles = 0; setTiles < totalTiles; setTiles++) {
			int randomTileRow = generator.getRandom(ROWS);
			int randomTileCol = generator.getRandom(COLUMNS);
			while (!elements[randomTileRow][randomTileCol].isFree()) {
				randomTileRow = generator.getRandom(ROWS);
				randomTileCol = generator.getRandom(COLUMNS);
			}
			// set a random value
			int value = generator.getRandom(3) + 1;
			setTile(randomTileRow, randomTileCol, value);
		}
	}

	/**
	 * Build a board with ROW number of rows and COLUMNS number of columns with
	 * all tiles set in zero
	 */
	public ThreesBoard() {
		// Creates a board of 4x4 with free tiles.
		elements = new ThreesTile[ROWS][COLUMNS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				elements[i][j] = new ThreesTile();
			}
		}
	}

	/**
	 * Build a board with ROW number of rows and COLUMNS number of columns with
	 * values in the array values
	 *
	 * @param values is a 4x4 array with the values of the tiles
	 */
	public ThreesBoard(int[][] values) {
		elements = new ThreesTile[ROWS][COLUMNS];
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				elements[i][j] = new ThreesTile();
				elements[i][j].setValue(values[i][j]);
			}
		}
	}

	/**
	 * 
	 * @return true iff there is no possible movement
	 */
	public boolean isFinished() {
		if (canMoveLeft() || canMoveRight() || canMoveUp() || canMoveDown())
			return false;

		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (elements[i][j].isFree())
					return false;
			}
		}

		return true;
	}

	/**
	 * 
	 * @return the number of tiles that already set
	 */
	public int numberOfSetTiles() {
		int setTiles = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (!elements[i][j].isFree())
					setTiles++;
			}
		}
		return setTiles;
	}

	/**
	 * 
	 * @return true whether the board would change through a movement to the left,
	 *         false otherwise
	 */
	public boolean canMoveLeft() {
		boolean canMove = false;
		for (int row = 0; row < ROWS; row++) {
			for (int col = 1; col < COLUMNS; col++) {
				ThreesTile leftTile = elements[row][col - 1];
				ThreesTile currentTile = elements[row][col];

				if (canTilesCombine(leftTile, currentTile) || (!currentTile.isFree() && leftTile.isFree())) {
					canMove = true;
				}
			}
		}
		return canMove;
	}

	/**
	 * 
	 * @return true whether the board would change through a movement to the right,
	 *         false otherwise.
	 */
	public boolean canMoveRight() {
		boolean canMove = false;

		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLUMNS - 1; col++) {
				ThreesTile tileRight = elements[row][col + 1];
				ThreesTile currentTile = elements[row][col];

				if (canTilesCombine(tileRight, currentTile) || (!currentTile.isFree() && tileRight.isFree())) {
					canMove = true;
				}
			}
		}

		return canMove;
	}

	/**
	 * 
	 * @return true whether the board would change through a movement upward, false
	 *         otherwise
	 */
	public boolean canMoveUp() {
		for (int row = 1; row < ROWS; row++) {
			for (int col = 0; col < COLUMNS; col++) {
				ThreesTile tileAbove = elements[row - 1][col];
				ThreesTile currentTile = elements[row][col];

				if (canTilesCombine(tileAbove, currentTile) || (!currentTile.isFree() && tileAbove.isFree())) {
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * 
	 * @return true whether the board would change through a movement downward,
	 *         false otherwise
	 */
	public boolean canMoveDown() {
		boolean canMove = false;

		for (int row = 0; row < ROWS - 1; row++) {
			for (int col = 0; col < COLUMNS; col++) {

				ThreesTile currentTile = elements[row][col];
				ThreesTile tileDown = elements[row + 1][col];

				if (canTilesCombine(currentTile, tileDown)
						|| (!currentTile.isFree() && tileDown.isFree())) {
					canMove = true;
				}

			}
		}
		return canMove;
	}

	/**
	 * Determines whether two ThreesTile objects can be combined according to
	 * specific rules.
	 *
	 * @param t1 the first ThreesTile to check for combinability
	 * @param t2 the second ThreesTile to check for combinability
	 * @return true if the tiles can be combined; false otherwise
	 * 
	 */
	public boolean canTilesCombine(ThreesTile t1, ThreesTile t2) {
		if (t1.getValue() >= 3 && t1.getValue() == t2.getValue())
			return true;

		if (t1.getValue() == 1 && t2.getValue() == 2)
			return true;

		if (t2.getValue() == 1 && t1.getValue() == 2)
			return true;

		return false;
	}

	/**
	 * Sets the value of the cell at the specified position in the Board.
	 *
	 * This method updates the value of the tile located at the given row and column
	 * indices, provided that the indices are within the bounds of the board. If the
	 * indices
	 * are out of bounds, an IllegalArgumentException is thrown.
	 *
	 * @param row the row index of the cell to update, must be within the valid
	 *            range [0, ROWS - 1]
	 * @param col the column index of the cell to update, must be within the valid
	 *            range [0, COLUMNS - 1]
	 * @param v   the value to set in the cell located at [row, col]
	 * @throws IllegalArgumentException if row or col are out of bounds
	 */

	public void setTile(int row, int col, int v) {
		if (row >= 0 && row < ROWS && col >= 0 && col < COLUMNS) {
			elements[row][col].setValue(v);
		} else
			throw new IllegalArgumentException();

	}

	/**
	 * Retrieves the ThreesTile located at the specified position in the board.
	 *
	 * This method returns the tile found at the given row and column indices
	 * provided. If the indices are out of bounds, an IllegalArgumentException is
	 * thrown.
	 *
	 * @param row the row index of the tile to retrieve, must be within the range
	 *            [0, ROWS - 1]
	 * @param col the column index of the tile to retrieve, must be within the range
	 *            [0, COLUMNS - 1]
	 * @return the ThreesTile at the specified position {@code [row, col]}
	 * @throws IllegalArgumentException if row or col are out of bounds
	 */
	public ThreesTile getTile(int row, int col) {
		if (0 <= row && row < ROWS && 0 <= col && col <= COLUMNS) {
			return elements[row][col];
		} else
			throw new IllegalArgumentException();
	}

	/**
	 * Computes and returns the total score for the current board based on tile
	 * values.
	 *
	 * This method iterates over each tile in the board, applying specific rules to
	 * calculate
	 * the score:
	 * 
	 * For tiles with a value of 3, the tile's value is added directly to the score.
	 * For tiles with a value greater than 3, the score contribution is calculated
	 * as
	 * (value - 3) * 3 and then added to the score.
	 * 
	 * 
	 * @return the computed total score based on the values of all tiles in the
	 *         board
	 */
	public int computeScore() {
		int score = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				if (elements[i][j].getValue() == 3) {
					score += 3;
				}
				if (elements[i][j].getValue() > 3) {
					score += ((elements[i][j].getValue() - 3) * 3);
				}
			}
		}
		return score;
	}

	public String toString() {
		// Encontrar el ancho máximo de los elementos para alinear el board.
		int maxWidth = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {
				int elementWidth = elements[i][j].toString().length();
				if (elementWidth > maxWidth) {
					maxWidth = elementWidth;
				}
			}
		}

		// Construir el string con las columnas alineadas.
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLUMNS; j++) {

				str.append(String.format("%" + maxWidth + "s ", elements[i][j].toString()));
			}
			str.append("\n");
		}
		return str.toString();
	}
}