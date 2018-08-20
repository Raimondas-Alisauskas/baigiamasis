package com.kursinis;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Mouse {

	private static final int CELLSIZE = 30;

	// private int mazeX;
	// private int mazeY;
	private int mouseX;
	private int mouseY;

	private Image mousePic;

	public Mouse(Point mouse) {

		ImageIcon img = new ImageIcon(
				"C:\\Users\\Pusele\\Desktop\\Java\\Workspaces\\CatAndMouse\\src\\com\\mouse1.png");
		setMousePic(img.getImage());

		// setMazeX(30);
		// setMazeY(30);

		this.mouseX = CELLSIZE * mouse.getY();// Array ir grafinio maze asys yra atvirkscios
		this.mouseY = CELLSIZE * mouse.getX();

	}

	public void move(int choiceX, int choiceY) {
		// public void move(int dx, int dy, int choiceX, int choiceY) {

		// setMazeX(getMazeX() + dx);
		// setMazeY(getMazeY() + dy);
		setMouseX(getMouseX() + choiceX);
		setMouseY(getMouseY() + choiceY);

	}

	/*
	 * public int getMazeX() { return mazeX; }
	 * 
	 * public void setMazeX(int mazeX) { this.mazeX = mazeX; }
	 * 
	 * public int getMazeY() { return mazeY; }
	 * 
	 * public void setMazeY(int mazeY) { this.mazeY = mazeY; }
	 */

	public int getMouseX() {
		return mouseX;
	}

	public void setMouseX(int mouseX) {
		this.mouseX = mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void setMouseY(int mouseY) {
		this.mouseY = mouseY;
	}

	public Image getMousePic() {
		return mousePic;
	}

	public void setMousePic(Image mousePic) {
		this.mousePic = mousePic;
	}
}
