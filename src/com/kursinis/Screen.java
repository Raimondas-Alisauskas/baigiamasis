package com.kursinis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Screen extends JPanel implements ActionListener, KeyListener {

	Timer tm = new Timer(5, this);

	private Maze mazePlan;
	private Mouse mouseI;

	public Screen() {
		setBackground(Color.gray);

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

		this.mazePlan = new Maze(maze);
		this.mouseI = new Mouse(new Point(7, 9));

		tm.start();
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		g.translate(200, 100);


		for (int i = 0; i < mazePlan.getHeight(); i++) {
			for (int j = 0; j < mazePlan.getWidth(); j++) {
				Color color;
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
				g.fillRect(30 * j, 30 * i, 30, 30);
				g.setColor(Color.BLACK);
				g.drawRect(30 * j, 30 * i, 30, 30);
			}
		}

		g.drawImage(mouseI.getMousePic(), mouseI.getMouseX(), mouseI.getMouseY(), null);


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int choice = e.getKeyCode();

		if (choice == KeyEvent.VK_LEFT) {
			mouseI.move(-30, 0);
			// mouseI.move(-30, 0, -1, 0);
		}

		if (choice == KeyEvent.VK_RIGHT) {
			mouseI.move(30, 0);
			// mouseI.move(30, 0, 1, 0);
		}

		if (choice == KeyEvent.VK_UP) {
			mouseI.move(0, -30);
			// mouseI.move(0, -30, 0, -1);
		}

		if (choice == KeyEvent.VK_DOWN) {
			mouseI.move(0, 30);
			// mouseI.move(0, 30, 0, 1);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
