package workspace;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListenMouse   implements MouseListener {
	public static int score;
	public static int miss;
	
	public ListenMouse(int score, int miss) {
		this.score = score;
		this.miss = miss;
	}

	public void mousePressed(MouseEvent e) {
		
	
		int x = GameObject.getX();
		int y = GameObject.getY();
		int mouseX = e.getX();
		int mouseY = e.getY();
		
		
		
		if((mouseX <= x+32 && mouseX >= x) && (mouseY <= y+32 && mouseY >= y )) {
			setScore(getScore()+1);
			
			System.out.println("HIT!");
			
			
		}else {
			setMiss(getMiss()+1);
			System.out.println("MISS " + getMiss());
			
		}
		
		
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
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
