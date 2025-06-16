package activities;

import java.awt.Rectangle;

public class Projectile {
	
	int x,y,VelX,VelY;
	
	
	
	public Projectile (int startX, int startY, int velx, int vely) {
		x=startX;
		y=startY;
		VelX = velx;
		VelY = vely;
	}
	
	public void shoot() {
		x=x+VelX;
		y=y+VelY;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,11,13);
	}

}
