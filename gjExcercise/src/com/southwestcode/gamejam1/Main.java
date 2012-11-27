package com.southwestcode.gamejam1;

import javax.swing.JFrame;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L; // to stop eclipse complain
	private final int WIDTH = 800;
	private final int HEIGHT = 600;
	private final String TITLE = "Eat and don't die";

	public static Main instance = null;

	private Main() {
		super(); // construct a new invisible JFrame
		
		add(new Board());
		
		
		/* Define the frame properties */
		this.setSize(this.WIDTH, this.HEIGHT);
		this.setTitle(TITLE);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static Main getInstance() {
		if (instance == null) {
			instance = new Main();
		}
		return instance;
	}

	/* End of singleton code */

	public static void main(String[] args) {
		System.out.println("It is ALIVE!");
		Main.getInstance();
		
	}
}
