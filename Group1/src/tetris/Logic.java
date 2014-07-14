package tetris;

public class Logic {

	public State state;

	public Logic(State state) {
		this.state = state;
	}
	
	public void moveLeft() {
		if (state.figureColumn == 0) {
			return;
		}
		state.moveFigureLeft();
	}
	
	public void moveRight() {
		if (state.figureColumn == 
				state.field.box[0].length
				- state.figure.data[0].length) {
			return;
		}
		state.moveFigureRight();
	}
	
	public void drop() {
		
	}
	
	public void rotate() {
		
	}
	
	public void moveDown() {
		
	}

	public void newGame() {
		state.init();
	}

}
