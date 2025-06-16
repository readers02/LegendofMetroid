package activities;

import java.awt.Rectangle;

public class EnemyProjectile {

	int x,y,VelX,VelY;
	
	
	
	public EnemyProjectile (int startX, int startY, int velx, int vely) {
		x=startX;
		y=startY;
		VelX = velx;
		VelY = vely;
	}

	public void EnemyShoot() {
		x=x+VelX;
		y=y+VelY;
	}
	
	//public Rectangle EnemyGetBounds(int pewType) {
	public Rectangle EnemyGetBounds() {
		return new Rectangle(x,y,24,24);
	}

}
