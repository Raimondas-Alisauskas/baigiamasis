package com.kursinis;

public class Maze {

	private static final char OPEN = 'O';
	private static final char VISITED = 'V';


	private char[][] maze;
	private int x;
	private int y;

	public Maze(char[][] maze) {
		this.maze = maze;

	}

	public char[][] getMaze() {
		return maze;
	}

	public void setMaze(char[][] maze) {
		this.maze = maze;
	}


	public int getWidth() {
		return maze[0].length;
	}

	public int getHeight() {
		return maze.length;
	}

	public boolean pointIsFree(Point point) {
		return pointIsFree(point.getX(), point.getY());
	}

	private boolean pointIsFree(int x, int y) {
		return maze[x][y] == OPEN;
	}

	public boolean pointIsValid(Point point) {
		return pointIsValid(point.getX(), point.getY());
	}

	public void pointIsVisited(Point point) {
		maze[point.getX()][point.getY()] = VISITED;
	}

	private boolean pointIsValid(int x, int y) {
		return x > 0 && x <= getHeight() && y > 0 && y <= getWidth();
	}

	public void drawMaze(char[][] maze) {
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				if (j < maze[0].length - 1) {
					System.out.print(maze[i][j] + " ");
				} else {
					System.out.print(maze[i][j] + "\n");
				}
			}
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


}
