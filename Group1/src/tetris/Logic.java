package tetris;

public class Logic implements EventProcessor {

	public State state;

	public Logic(State state) {
		this.state = state;
	}
	
	@Override
	public void moveLeft() {
		if (state.figureColumn == 0) {
			return;
		}
		state.moveFigureLeft();
	}
	
	@Override
	public void moveRight() {
		if (state.figureColumn == 
				state.field.box[0].length
				- state.figure.data[0].length) {
			return;
		}
		state.moveFigureRight();
	}
	
	@Override
	public void drop() {
		
	}
	
	@Override
	public void rotate() {
		
	}
	
	@Override
	public void moveDown() {
		if (!state.canMoveDown()) {
			state.pasteFigure();
			state.removeFullRows();
			state.nextFigure();
			return;
		}
		state.moveFigureDown();
	}

	@Override
	public void newGame() {
		state.init();
	}

}
