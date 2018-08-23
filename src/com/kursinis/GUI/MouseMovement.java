package com.kursinis.GUI;

import java.awt.Image;

import javax.swing.ImageIcon;

import com.kursinis.model.Maze;
import com.kursinis.model.Point;

public class MouseMovement {

	private int mouseX;
	private int mouseY;
	private Maze mazePlan;
	private Point mouse;

	private Image mousePic;

	public MouseMovement(Point mouse, Maze mazePlan) {

		ImageIcon img = new ImageIcon(
				"C:\\Users\\Pusele\\Desktop\\Java\\Workspaces\\CatAndMouse\\src\\com\\mouse2.png");
		setMousePic(img.getImage());

		this.mouseX = mouse.getX();
		this.mouseY = mouse.getY();
		this.mouse = mouse;

	}

	public void moveLeft() {
		Point toLeft = new Point(mouse.getX() - 1, mouse.getY());
		if (mazePlan.pointIsTransible(toLeft)) {
			this.setMouseX(getMouseX() - 1);
			this.setMouseY(getMouseY());
			this.setMouse(toLeft);
		}
	}

	public void moveRight() {
		Point toRight = new Point(mouse.getX() + 1, mouse.getY());
		if (mazePlan.pointIsTransible(toRight)) {
			this.setMouseX(getMouseX() + 1);
			this.setMouseY(getMouseY());
			this.setMouse(toRight);
		}

	}

	public void moveUp() {
		Point up = new Point(mouse.getX(), mouse.getY() - 1);
		if (mazePlan.pointIsTransible(up)) {
			this.setMouseX(getMouseX());
			this.setMouseY(getMouseY() - 1);
			this.setMouse(up);
		}

	}

	public void moveDown() {
		Point down = new Point(mouse.getX(), mouse.getY() + 1);
		if (mazePlan.pointIsTransible(down)) {
		this.setMouseX(getMouseX());
		this.setMouseY(getMouseY() + 1);
			this.setMouse(down);
		}

	}


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

	public Point getMouse() {
		return mouse;
	}

	public void setMouse(Point mouse) {
		this.mouse = mouse;
	}

}
