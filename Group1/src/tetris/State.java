package tetris;

public class State {

	public Field field;
	public Figure figure;
	public int figureRow;
	public int figureColumn;

	public State(int rows, int columns) {
		field = new Field(rows, columns);
	}

	public void init() {
		figure = Figure.generateRandom();
		figureColumn = field.box[0].length / 2 
				- figure.data[0].length/2; 
	}

	public void moveFigureLeft() {
		figureColumn--;
	}

	public void moveFigureRight() {
		figureColumn++;
	}

}
