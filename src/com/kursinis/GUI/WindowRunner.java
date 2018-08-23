package com.kursinis.GUI;

import java.io.IOException;

import javax.swing.JFrame;

public class WindowRunner {

	public static WindowRunner game;
	public Screen screen;
	JFrame frame;
	// JButton Start = new JButton("Start");
	// JButton Exit = new JButton("Exit");
	// JButton Start = new JButton("Start");

	public static String title = "Pagauk, jei gali";
	public static int width = 800;
	public static int height = 700;
	public static int buttonWidth = 100;
	public static int butttonHeight = 30;

	public WindowRunner() throws IOException {
		frame = new JFrame();
		frame.setTitle(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);

		screen = new Screen();
		frame.add(screen);
		frame.setVisible(true);


		// Start.setSize(buttonWidth, butttonHeight);
		// Start.setLocation(10, 700);
		// Start.setBackground(Color.LIGHT_GRAY);
		// Start.setForeground(Color.black);
		// frame.add(Start);
		// Start.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		// });
		//
		// Exit.setSize(buttonWidth, butttonHeight);
		// Exit.setLocation(200, 700);
		// Exit.setBackground(Color.LIGHT_GRAY);
		// Exit.setForeground(Color.black);
		// frame.add(Exit);
		// Exit.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent e) {
		// // TODO Auto-generated method stub
		//
		// }
		// });


	}

	public static void main(String[] args) throws IOException {


		game = new WindowRunner();

	}

}
