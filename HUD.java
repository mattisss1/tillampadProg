package workspace;

import java.awt.Color;
import java.awt.Graphics;


public class HUD {
	
	private int score = 0;
	private int miss ;
	
	public void tick() {
		
	}
	public void render (Graphics g) {
		int tempScore = score -1;
		g.setColor(Color.magenta);
		g.drawString("Score: " + tempScore , 15, 64);
		
		
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setMiss(int miss) {
		this.miss = miss;
	}
	public int getMiss() {
		return miss;
	}
}
