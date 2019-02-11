package workspace;

import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class GameObject {
	
	protected static int x;
	protected static int y;
	protected ID id;
	
	public GameObject(int x, int y, ID id) {
		GameObject.x = x;
		GameObject.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	public abstract Rectangle getBounds();
	
	public void setX (int x) {
		GameObject.x = x;
	}
	public void setY (int y) {
		GameObject.y = y;
	}
	public void setId (ID id) {
		this.id = id;
	}
	public static int getX() {
		return x;
	}
	public static int getY() {
		return y;
	}
	public ID getId() {
		return id;
	}

	
}
