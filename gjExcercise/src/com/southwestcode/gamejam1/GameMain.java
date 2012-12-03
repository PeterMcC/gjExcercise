package com.southwestcode.gamejam1;

import javax.swing.JFrame;

public class GameMain {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	static final String TITLE = "EAT TEST";

	private GameMain() {
		
		Gui gui = new Gui(); // construct a new JFrame
		gui.add(new Board());// add JPanel
		
		
		/* Define the frame properties */
		gui.setSize(this.WIDTH, this.HEIGHT);
		gui.setTitle(TITLE);
		gui.setResizable(false);
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setVisible(true);

	}

	public static void main(String[] args) {
		System.out.println("It is ALIVE!");
		new GameMain();
		
	}
}
