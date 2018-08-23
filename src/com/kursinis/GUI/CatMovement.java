package com.kursinis.GUI;

import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;

import com.kursinis.model.Maze;
import com.kursinis.model.Point;
import com.kursinis.pathSearch.ShortestPathSearch;

public class CatMovement {

	private int catX;
	private int catY;

	private Image catPic;

	public CatMovement(Point cat) {

		ImageIcon img = new ImageIcon("cat2.png");
		this.setCatPic(img.getImage());

		this.setCatX(cat.getX());
		this.setCatY(cat.getY());
	}

	public Point start(Maze mazePlan, Point cat, Point mouse) {

		ShortestPathSearch shortestPath = new ShortestPathSearch(mazePlan, cat, mouse);
		List<Point> path = shortestPath.findShortestPath();

		Point firstPoint = path.get(2);

		cat = firstPoint;

		this.setCatX(firstPoint.getX());
		this.setCatY(firstPoint.getY());

		return cat;

	}

	public int getCatX() {
		return catX;
	}

	public void setCatX(int catX) {
		this.catX = catX;
	}

	public int getCatY() {
		return catY;
	}

	public void setCatY(int catY) {
		this.catY = catY;
	}

	public Image getCatPic() {
		return catPic;
	}

	public void setCatPic(Image catPic) {
		this.catPic = catPic;
	}

}
