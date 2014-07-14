package tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Figure {

	static int[][] figureI = {
			{0,1,0,0},
			{0,1,0,0},
			{0,1,0,0},
			{0,1,0,0},
		};
	static int[][] figureS = {
			{0,1,0,0},
			{0,1,1,0},
			{0,0,1,0},
			{0,0,0,0},
		};
	static int[][] figureL = {
			{0,1,1,0},
			{0,1,0,0},
			{0,1,0,0},
			{0,0,0,0},
		};
	static int[][] figureT = {
			{0,1,0,0},
			{0,1,1,0},
			{0,1,0,0},
			{0,0,0,0},
		};
	static int[][] figureQ = {
			{0,0,0,0},
			{0,1,1,0},
			{0,1,1,0},
			{0,0,0,0},
		};

	static List<int[][]> allFigures;
	
	static {
		allFigures = new ArrayList<int[][]>();
		allFigures.add(figureI);
		allFigures.add(rotateLeft(figureI));
		
		allFigures.add(figureS);
		int[][] flippedS = flip(figureS);
		allFigures.add(flippedS);
		allFigures.add(rotateLeft(figureS));
		allFigures.add(rotateLeft(flippedS));
		
		allFigures.add(figureL);

		allFigures.add(figureT);
		
		allFigures.add(figureQ);
	}
	
	int[][] data = new int[4][4];

	private Figure() {
	}
	
	private static Random random = new Random();
	
	static Figure generateRandom() {
		int figureIndex = random.nextInt(allFigures.size());
		
		Figure figure = new Figure();
		figure.data = allFigures.get(figureIndex);
		
		return figure;
	}
	
	static int[][] flip(int[][] data) {
		return data;
	}
	
	static int[][] rotateLeft(int[][] data) {
		return data;
	}

	static int[][] rotateRight(int[][] data) {
		return data;
	}
	
}
