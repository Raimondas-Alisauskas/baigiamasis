package com.kursinis;

import java.util.List;
import java.util.Scanner;

public class Action {

	private Maze mazePlan;
	private Point cat;
	private Point mouse;

	public Action(Maze mazePlan, Point cat, Point mouse) {
		this.mazePlan = mazePlan;
		this.cat = cat;
		this.mouse = mouse;

	}

	public void start() {

		while (!(cat.getX() == mouse.getX() && cat.getY() == mouse.getY())) {

			ShortestPathSearch shortestPath = new ShortestPathSearch(mazePlan, cat, mouse);
			List<Point> path = shortestPath.findShortestPath();
			// shortestPath.printShortestPath(path);

			// PathSearch justPath = new PathSearch(mazePlan, cat, mouse);
			// List<Point> path = justPath.findPath();
			// justPath.printPath(path);

			Point firstPoint = path.get(1);
			System.out.println(firstPoint);

			cat = firstPoint;

			Scanner skeneris = new Scanner(System.in);
			System.out.print("Jusu ejimas: ");
			String kryptis = skeneris.next();
			if (kryptis.equalsIgnoreCase("d")) {
				Point toRight = new Point(mouse.getX(), mouse.getY() + 1);
				{
					if (mazePlan.pointIsFree(toRight) && mazePlan.pointIsValid(toRight)) {
						mouse = toRight;
					}
				}

			} else if (kryptis.equalsIgnoreCase("s")) {
				Point down = new Point(mouse.getX() + 1, mouse.getY());
				{
					if (mazePlan.pointIsFree(down) && mazePlan.pointIsValid(down)) {
						mouse = down;
					}
				}
			} else if (kryptis.equalsIgnoreCase("a")) {
				Point toLeft = new Point(mouse.getX(), mouse.getY() - 1);
				{
					if (mazePlan.pointIsFree(toLeft) && mazePlan.pointIsValid(toLeft)) {
						mouse = toLeft;
					}
				}
			} else if (kryptis.equalsIgnoreCase("w")) {
				Point up = new Point(mouse.getX() - 1, mouse.getY());
				{
					if (mazePlan.pointIsFree(up) && mazePlan.pointIsValid(up)) {
						mouse = up;
					}
				}
			}
			System.out.println("tavo koordinates: " + mouse);

		}

		System.out.println("Game over");

	}

}
