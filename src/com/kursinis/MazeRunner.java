package com.kursinis;

public class MazeRunner {

	public static void main(String[] args) {

		char[][] maze = { { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, // x - wall
				{ 'X', 'O', 'O', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'X' }, // O - open
				{ 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'O', 'O', 'X', 'X', 'X', 'O', 'O', 'O', 'O', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'O', 'O', 'O', 'O', 'X', 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X', 'O', 'O', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'X', 'O', 'O', 'O', 'X', 'O', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'O', 'X', 'X', 'X', 'O', 'X', 'O', 'X', 'O', 'X' },
				{ 'X', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'X', 'O', 'X' },
				{ 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' } };

		Maze mazePlan = new Maze(maze);

		Point cat = new Point(1, 1);
		Point mouse = new Point(1, 3);

		Action move = new Action(mazePlan, cat, mouse);
		move.start();

		


	}
}


