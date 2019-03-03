package exercice2;

public class Mouton {
	private static int id = 0;
	private int NUM;
	
	public Mouton(){
		this.NUM = id;
		id++;
	}
	
	public int getNUM(){
		return NUM;
	}
}
