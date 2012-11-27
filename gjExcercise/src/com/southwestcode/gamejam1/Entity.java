package com.southwestcode.gamejam1;

import java.awt.Graphics2D;
import java.awt.Shape;

public abstract class Entity {
	//fields and methods for all interactive elements: enemies, player, etc.
	protected boolean alive;         // alive or dead
	protected double x, y;           // (x, y) location of its center
	protected double speed;          // speed in pixels per game-step
	protected double direction;      // movement direction in degrees
	protected double width, height;  // width and height of this actor
	
	
	// Draw itself
	public void draw(Graphics2D g2d) {
		
	}
	
	// Initialize this actor at the start of the game.
	public void initialize() { 
		
	}
	
	// For collision detection
	public boolean intersects(Shape shape) {
	
		return false; 
	}  // intersects with the given shape
	
	public Shape getBounds2D() {
	
		return null; 
	}              // returns a bounding box
	
}
