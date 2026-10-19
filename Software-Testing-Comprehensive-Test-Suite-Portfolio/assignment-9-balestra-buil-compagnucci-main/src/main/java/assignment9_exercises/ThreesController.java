package assignment9_exercises;

import java.util.LinkedList;

public class ThreesController {

	// Stores the Threes board
	private ThreesBoard board;
	// Stores the next tile that will appear in the board.
	private int nextTileValue;

	// Stores the rows that move during the last movement
	private LinkedList<Integer> movedRows;

	// Stores the columns that move during the last movement
	private LinkedList<Integer> movedColumns;

	public ThreesController() {
		// Create the initial board.
		// 9 random tiles set with 1, 2 or 3.
		board = new ThreesBoard(9);
		// Set randomly the next tile to appear in the board.
		nextTileValue = board.generator.getRandom(3) + 1;
		// initially no row or column has been moved.
		movedRows = new LinkedList<Integer>();
		movedColumns = new LinkedList<Integer>();
	}

	public ThreesController(ThreesBoard b) {
		this.board = b;
		// Set randomly the next tile to appear in the board.
		nextTileValue = board.generator.getRandom(3) + 1;
		// initially no row or column has been moved.
		movedRows = new LinkedList<Integer>();
		movedColumns = new LinkedList<Integer>();
	}

	public ThreesBoard getBoard() {
		return board;
	}

	public int getNextTileValue() {
		return nextTileValue;
	}

	/**
	 * Moves the game pieces on the board upward, merging adjacent pieces
	 * according to specified game rules.
	 *
	 * If a merge occurs, the board's state is updated accordingly.
	 *
	 * @return true if any pieces were moved or merged,
	 *         false if no pieces could be shifted upward.
	 */
	public boolean moveUp() {
		// clear last movements lists
		movedRows.clear();
		movedColumns.clear();

		if (!board.canMoveUp())
			return false;

		boolean modified = false;
		for (int j = 0; j < ThreesBoard.COLUMNS; j++) {

			boolean mayCombine = !board.getTile(0, j).isFree()
					&& !board.getTile(1, j).isFree()
					&& (board.canTilesCombine(board.getTile(0, j), board.getTile(1, j))
					|| !(board.getTile(2, j).isFree() && !board.getTile(3, j).isFree()));

			if (!mayCombine) {// move the tile to fill the free spaces
				int i = 0;
				while (i < ThreesBoard.ROWS && !board.getTile(i, j).isFree()) {
					i++;
				}
				for (int k = i + 1; k < ThreesBoard.ROWS; k++) {
					if (!board.getTile(k, j).isFree()) {
						movedColumns.add(j);
					}
					board.setTile(k - 1, j, board.getTile(k, j).getValue());
				}
				board.setTile(ThreesBoard.ROWS - 1, j, 0); // empty the last position
			} else { // combine just once. Here there is no free tile in the middle
				boolean updated = false;
				for (int i = 0; i < ThreesBoard.ROWS - 1 && !updated; i++) {
					if (board.canTilesCombine(board.getTile(i, j), board.getTile(i + 1, j))) {
						// produce first combination
						ThreesTile t = board.getTile(i, j).combineTile(board.getTile(i + 1, j));
						board.setTile(i, j, t.getValue());

						// move anything else to left in the same column
						for (int k = i + 2; k < ThreesBoard.ROWS; k++) {
							board.setTile(k - 1, j, board.getTile(k, j).getValue());
						}
						movedColumns.add(j);
						board.setTile(ThreesBoard.ROWS - 1, j, 0); // empty the last position
						modified = true;
						updated = true;
					}
				}
			}
		}

		loadNextTileOnColumns(true);
		return modified;
	}

	/**
	 * Moves the game pieces on the board downward, merging adjacent pieces
	 * according to specified game rules.
	 *
	 * If a merge occurs, the board's state is updated accordingly.
	 * 
	 * @return true if any pieces were moved or merged,
	 *         false if no pieces could be shifted upward.
	 */
	public boolean moveDown() {
		// clear last movements lists
		movedRows.clear();
		movedColumns.clear();

		if (!board.canMoveDown())
			return false;

		boolean modified = false;
		for (int j = 0; j < ThreesBoard.COLUMNS; j++) {

			boolean mayCombine = !board.getTile(3, j).isFree()
					&& !board.getTile(2, j).isFree()
					&& (board.canTilesCombine(board.getTile(3,j),board.getTile(2,j))
					|| !(board.getTile(1, j).isFree() && !board.getTile(0, j).isFree()));

			if (!mayCombine) {// move the tile to fill the free spaces
				int i = ThreesBoard.ROWS - 1;
				while (!board.getTile(i, j).isFree() && i >= 0)
					i--;
				for (int k = i - 1; k >= 0; k--) {
					if (!board.getTile(k, j).isFree())
						movedColumns.add(j);
					board.setTile(k + 1, j, board.getTile(k, j).getValue());
				}
				board.setTile(0, j, 0); // empty the last position
			} else { // combine just once. Here there is no free tile in the middle
				boolean updated = false;
				for (int i = ThreesBoard.ROWS - 1; i > 0 && !updated; i--) {
					if (board.canTilesCombine(board.getTile(i, j), board.getTile(i - 1, j))) {
						// produce first combination
						ThreesTile t = board.getTile(i, j).combineTile(board.getTile(i - 1, j));
						board.setTile(i, j, t.getValue());

						// move anything else to left in the same column
						for (int k = i - 2; k >= 0; k--) {
							board.setTile(k + 1, j, board.getTile(k, j).getValue());
						}
						movedColumns.add(j);
						board.setTile(0, j, 0); // empty the last position
						modified = true;
						updated = true;
					}
				}
			}
		}
		loadNextTileOnColumns(false);
		return modified;
	}

	/**
	 * Moves the game pieces on the board to the left, merging adjacent pieces
	 * according to specified game rules.
	 *
	 * If a merge occurs, the board's state is updated accordingly.
	 *
	 * @return true if any pieces were moved or merged,
	 *         false if no pieces could be shifted to the left.
	 */
	public boolean moveLeft() {
		// clear last movements lists
		movedRows.clear();
		movedColumns.clear();

		if (!board.canMoveLeft())
			return false;


		boolean modified = false;
		for (int i = 0; i < ThreesBoard.ROWS; i++) {


			boolean mayCombine = !board.getTile(i, 0).isFree() &&
								!board.getTile(i, 1).isFree() &&
								(board.canTilesCombine(board.getTile(i,0),board.getTile(i,1)) || !(board.getTile(i, 2).isFree() && !board.getTile(i, 3).isFree()));

			if (!mayCombine) { // move the tile to fill the free spaces
				int j = 0;
				while (!board.getTile(i, j).isFree() && j < ThreesBoard.COLUMNS) {
					j++;
				}
				for (int k = j + 1; k < ThreesBoard.COLUMNS; k++) {
					if (!board.getTile(i, k).isFree()) {
						movedRows.add(i);
					}
					board.setTile(i, k - 1, board.getTile(i, k).getValue());
				}
				board.setTile(i, ThreesBoard.COLUMNS - 1, 0); //empty the last position

			} else { // combine just once. Here there is no free tile in the middle
				boolean update = false;
				for (int j = 0; j < ThreesBoard.COLUMNS - 1 && !update; j++) {
					if (board.canTilesCombine(board.getTile(i, j), board.getTile(i, j + 1))) {
						// produce first combination
						ThreesTile t = board.getTile(i, j).combineTile(board.getTile(i, j + 1));
						board.setTile(i, j, t.getValue());

						// move anything else to left in the same column
						for (int k = j + 2; k < ThreesBoard.COLUMNS; k++) {
							board.setTile(i , k - 1, board.getTile(i, k).getValue());
						}
						movedRows.add(i);
						board.setTile(i, ThreesBoard.COLUMNS - 1, 0); // empty the last position
						update = true;
						modified = true;
					}
				}
			}
		}
		loadNextTileOnRows(true);
		return modified;
	}

	/**
	 * Moves the game pieces on the board to the right, merging adjacent pieces
	 * according to specified game rules.
	 *
	 * This method shifts all movable pieces towards the right side of the board,
	 *
	 * @return true if any pieces were moved or merged,
	 *         false if no pieces could be shifted to the right.
	 */
	 public boolean moveRight() {
		// clear last movements lists
		movedRows.clear();
		movedColumns.clear();

		if (!board.canMoveRight())
			return false;

		boolean modified = false;
		for (int i = 0; i < ThreesBoard.ROWS; i++) {

			boolean mayCombine = !board.getTile(i, 3).isFree() &&
					!board.getTile(i, 2).isFree() &&
					(board.canTilesCombine(board.getTile(i,3),board.getTile(i,2)) || !(board.getTile(i, 1).isFree() && !board.getTile(i, 0).isFree()));

			if (!mayCombine) { // there's free tiles
				int j = ThreesBoard.COLUMNS - 1;
				while (!board.getTile(i, j).isFree() && j >= 0)
					j--;
				for (int k = j - 1; k >= 0; k--) {
					if (!board.getTile(i, k).isFree())
						movedRows.add(i);
					board.setTile(i, k + 1, board.getTile(i, k).getValue());
					board.setTile(i, k, 0); // empty the last position	// TODO
				}
			} else { // there's no free tiles
				boolean updated = false;
				for (int j = ThreesBoard.COLUMNS - 1; j > 0 && !updated; j--) {
					if (board.canTilesCombine(board.getTile(i, j), board.getTile(i, j - 1))) {
						// produce first combination
						ThreesTile t = board.getTile(i, j).combineTile(board.getTile(i, j - 1));
						board.setTile(i, j, t.getValue());

						// move anything else to the right in the same row
						for (int k = j - 2; k >= 0; k--) {
							board.setTile(i, k + 1, board.getTile(i, k).getValue());
						}
						movedRows.add(i);
						board.setTile(i, 0, 0); // empty the last position
						updated = true;
						modified = true;
					}
				}
			}
		}

		loadNextTileOnRows(false);
		return modified;
	}

	/**
	 * Places the next tile on a random column after an upward or downward move.
	 *
	 * This method is called after a move is performed to add a new tile
	 * at the top or bottom of a randomly selected column from the list of
	 * recently moved columns. If the move was upward, the tile is added at
	 * the bottom row; if downward, it is added at the top row.
	 *
	 * The tile's value is determined by nextTileValue. After placing
	 * the tile, a new random value between 1 and 3 is assigned to nextTileValue.
	 *
	 * @param up true if the previous move was upward, false if downward.
	 */
	private void loadNextTileOnColumns(boolean up) {

		// Assume an upward or downward was performed.
		if (!movedColumns.isEmpty()) {
			int pos = board.generator.getRandom(movedColumns.size());
			if (up)
				board.setTile(ThreesBoard.ROWS - 1, movedColumns.get(pos), nextTileValue);
			else
				board.setTile(0, movedColumns.get(pos), nextTileValue);
			nextTileValue = board.generator.getRandom(3) + 1;
		}
	}

	/**
	 * Places the next tile on a random row after a leftward or rightward move.
	 *
	 * This method is called after a move is performed to add a new tile
	 * at the leftmost or rightmost position of a randomly selected row from
	 * the list of recently moved rows. If the move was leftward, the tile is
	 * added at the rightmost column; if rightward, it is added at the leftmost
	 * column.
	 *
	 * The tile's value is determined by {@code nextTileValue}. After placing
	 * the tile, a new random value between 1 and 3 is assigned to
	 * {@code nextTileValue}.
	 *
	 * @param left true if the previous move was leftward, false if rightward.
	 */
	private void loadNextTileOnRows(boolean left) {
		// Assume an upward or downward was performed.
		if (!movedRows.isEmpty()) {
			int pos = board.generator.getRandom(movedRows.size());
			if (left)
				board.setTile(movedRows.get(pos), ThreesBoard.COLUMNS - 1, nextTileValue);
			else
				board.setTile(movedRows.get(pos), 0, nextTileValue);
			nextTileValue = board.generator.getRandom(3) + 1;
		}
	}
}