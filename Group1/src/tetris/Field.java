package tetris;

public class Field {

	public int[][] box;

	public Field(int rows, int columns) {
		box = new int[rows][columns];
	}

	public boolean hasConflict(int column, int row, int[][] data) {
		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				if (data[r][c] > 0) {
					if (!isInside(r + row, c + column)) {
						return true;
					}
					if (box[r + row][c + column] > 0) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean isInside(int i, int j) {
		return i >= 0 && j >= 0 && i < box.length && j < box[0].length;
	}

	public int getRows() {
		return box.length;
	}

	public int getColumns() {
		return box[0].length;
	}

	public void removeFullRows() {
		int[][] b = new int[box.length][box[0].length];

		int ptr = box.length - 1;
		for (int row = box.length - 1; row >= 0; row--) {
			if (isFull(box[row])) {
				continue;
			}
			b[ptr--] = box[row];
		}
		
		box = b;

	}

	private boolean isFull(int[] row) {
		for (int c = 0; c < row.length; c++) {
			if (row[c] == 0) {
				return false;
			}
		}
		return true;
	}

}
