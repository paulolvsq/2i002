
public class Piece {
	private int[] cotes;
	private int iRotation;
	
	public Piece(int g, int h, int d, int b){
		cotes = new int[]{g,h,d,b}; // syntaxe rapide
		iRotation = 0;
	}
	
	public void rotation(){ // 90 sens horaire
		iRotation ++;
	}
	
	public int getG(){return cotes[(0+iRotation)%4];}
	public int getH(){return cotes[(1+iRotation)%4];}
	public int getD(){return cotes[(2+iRotation)%4];}
	public int getB(){return cotes[(3+iRotation)%4];}
	// toujours penser a l'affichage pour le debbuggage
	
	public String toString(){ // utilisation des sous-fonctions
		return " "+getH()+" "+"\n"+ getG()+" "+
		getD()+"\n"+ " "+getB()+" ";
	}
}
