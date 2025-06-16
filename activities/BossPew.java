package activities;

import java.awt.Rectangle;

//make sure that you use this for each shot, just call it twice in a row with each direction you only need 1 bosspew

public class BossPew {
	
	int destinx,destiny,x1,y1;
	double x,y;
	int xA,yA;
	
	
	public BossPew (int startx, int starty, int targetx, int targety) {
		x1 = startx;
		y1 = starty;
		destinx = targetx;
		destiny = targety;
		//radius
		double pewVel = 5.0; 
		//angle
		double theta = Math.atan2(targetx-startx,targety-starty);
		y = pewVel*Math.cos(theta);
		x = pewVel*Math.sin(theta);
		xA = (int) Math.round(x);
		yA = (int) Math.round(y);
	}
	
	public void specialShoot() {
		x1=x1+xA;
		y1=y1+yA;
	}
	
	public Rectangle BossPewCollision() {
		return new Rectangle(x1,y1,32,32);
	}

}

