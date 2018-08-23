package com.kursinis.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.kursinis.mazeLoader.MazePlan;
import com.kursinis.model.Maze;
import com.kursinis.model.Point;

public class Screen extends JPanel implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int CELLSIZE = 30;

	private Maze mazePlan;
	private Mouse mouseI;
	private CatMovement catI;
	private Point mouse;
	private Point cat;
	String messageOver = "";
	private Image happyCat;
	private boolean win = false;

	Timer tm = new Timer(25, this);

	public Screen() throws IOException {
		setBackground(Color.GRAY);

		MazePlan mazeLoader = new MazePlan();
		mazeLoader.loadMazePlan();
		mazePlan = mazeLoader.getMazePlan();

		mouse = new Point(3, 4);
		cat = new Point(1, 1);

		this.mouseI = new Mouse(mouse);
		this.catI = new CatMovement(cat);

		tm.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		ImageIcon icon = new ImageIcon("HappyCat.gif");
		this.setHappyCat(icon.getImage());
	}

	public Image getHappyCat() {
		return happyCat;
	}

	public void setHappyCat(Image image) {
		this.happyCat = image;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.translate(25, 25);

		if (!win) {

			for (int i = 0; i < mazePlan.getWidth(); i++) {
				for (int j = 0; j < mazePlan.getHeight(); j++) {
					Color color = null;
					switch (mazePlan.getMaze()[i][j]) {
					case 'X':
						color = Color.DARK_GRAY;
						break;
					case 'O':
						color = Color.WHITE;
						break;
					default:
						color = Color.BLUE;
					}
					g.setColor(color);
					g.fillRect(30 * i, 30 * j, 30, 30);
					g.setColor(Color.BLACK);
					g.drawRect(30 * i, 30 * j, 30, 30);
				}
			}

			g.drawImage(mouseI.getMousePic(), mouseI.getMouseX() * CELLSIZE, mouseI.getMouseY() * CELLSIZE, null);
			g.drawImage(catI.getCatPic(), catI.getCatX() * CELLSIZE, catI.getCatY() * CELLSIZE, null);
		}

		if (win) {

			g.drawImage(happyCat, 150, 100, null);
			g.drawString(messageOver, 300, 400);

		}

	}

	// while(!(cat.getX()==mouse.getX()&&cat.getY()==mouse.getY()))

	@Override
	public void actionPerformed(ActionEvent e) {
		if ((cat.getX() == mouse.getX() && cat.getY() == mouse.getY())) {
			win = true;

			// JLabel labelOver = new JLabel("Niam niam", (Icon) happyCat, JLabel.CENTER);
			// Set the position of the text, relative to the icon:
			// labelOver.setVerticalTextPosition(JLabel.BOTTOM);
			// labelOver.setHorizontalTextPosition(JLabel.CENTER);

		}
		repaint();

	}


	@Override
	public void keyPressed(KeyEvent e) {
		int choice = e.getKeyCode();

		if (choice == KeyEvent.VK_RIGHT) {
			Point toRight = new Point(mouse.getX() + 1, mouse.getY());
			if (mazePlan.pointIsTransible(toRight)) {
				mouseI.moveRight();
				mouse = toRight;
			}

		} else if (choice == KeyEvent.VK_LEFT) {
			Point toLeft = new Point(mouse.getX() - 1, mouse.getY());
			if (mazePlan.pointIsTransible(toLeft)) {
				mouseI.moveLeft();
				mouse = toLeft;
			}

		} else if (choice == KeyEvent.VK_UP) {
			Point up = new Point(mouse.getX(), mouse.getY() - 1);
			if (mazePlan.pointIsTransible(up)) {
				mouseI.moveUp();
				mouse = up;
			}

		} else if (choice == KeyEvent.VK_DOWN) {
			Point down = new Point(mouse.getX(), mouse.getY() + 1);
			if (mazePlan.pointIsTransible(down)) {
				mouseI.moveDown();
				mouse = down;
			}
		}

		cat = catI.start(mazePlan, cat, mouse);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public boolean isWin() {
		return win;
	}

	public void setWin(boolean win) {
		this.win = win;
	}

}
