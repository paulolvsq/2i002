package exercice3;

public class Bombe {
	private int x, y, timer, portee;
	private static int id = 0;
	private int NUM;
	
	public Bombe(int x, int y){
		NUM = id;
		id++;
		this.x = x;
		this.y = y;
		this.timer = (int)(Math.random() * 5 + 2);
		this.portee = 3;
	}
	
	public Bombe(){
		this(0,0);
	}
	
	public void update(){
		this.timer--;
	}
	
	public int getTimer(){
		return this.timer;
	}
	
	public int getPortee(){
		return this.portee;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public int getNUM(){
		return NUM;
	}
}
