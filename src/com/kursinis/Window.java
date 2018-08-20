package com.kursinis;

import javax.swing.JFrame;

public class Window {

	public static Window game;
	public Screen screen;
	JFrame frame;

	public static String title = "Pagauk, jei gali";
	public static int width = 800;
	public static int height = 600;

	public Window() {
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);

		screen = new Screen();
		frame.add(screen);

		frame.setVisible(true);

	}

	public static void main(String[] args) {

		game = new Window();

	}

}
