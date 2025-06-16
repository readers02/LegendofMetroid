package activities;

import java.awt.Rectangle;

public class Wall_Collision {
	int x,y;
	
	public Wall_Collision(int startx, int starty) {
		x = startx;
		y = starty;
	}
	
	public Rectangle getBounds() {
		return new Rectangle (x,y, 64,64);
	}
}
