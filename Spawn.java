package workspace;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Spawn extends ListenMouse{
	
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	private int width;
	private int height;
	
	

	public Spawn(Handler handler, HUD hud, int WIDTH, int HEIGHT){
		super(score,miss);
		this.handler = handler;
		this.hud = hud;
		this.width = r.nextInt(WIDTH);
		this.height = r.nextInt(HEIGHT);
		
		
	}
	public void render(Graphics g) {
		if(miss == 3) {
			g.setColor(Color.magenta);
			g.drawString("LOST "  , 290, 200);
		}
		
	}
	public void tick() {
		
		if(miss == 3) {
			handler.clearObjects();
			
		}
		
		if(hud.getScore() == 0) {
			
			
			handler.addObject(new BigRect(r.nextInt(width),r.nextInt(height-32)+32, ID.BigRect, handler));
			hud.setScore(1);
		}
		
		if( getScore() == 1) {
			setScore(0);
			hud.setScore(hud.getScore()+1);
			
			
			if(hud.getScore() >= 10) {
				System.out.println("Score: " + (hud.getScore() -1));
				System.out.println("Misses: " + miss);
				handler.clearObjects();
				handler.addObject(new SmallRect(r.nextInt(width),r.nextInt(height), ID.SmallRect,handler));
				
			}else {
				System.out.println("Score: " + (hud.getScore() - 1));
				handler.clearObjects();
				handler.addObject(new BigRect(r.nextInt(width),r.nextInt(height), ID.BigRect, handler));
				System.out.println("Misses: " + miss);
			}
		}
		
		
		
	}
}