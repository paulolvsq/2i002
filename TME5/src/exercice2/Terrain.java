package exercice2;

public class Terrain {
	private Case[][] terrain;
	public static final int taille = 20;
	
	public Terrain(){
		terrain = new Case[taille][taille];
		for(int i =0; i< taille; i++){
			for(int j =0; j< taille; j++){
				terrain[i][j] = new Case();
				if (Math.random()<= 0.05){
					Mouton m = new Mouton();
					
					terrain[i][j].setMouton(m);
				}
			}
		}
	}
	
	public String toString(){
		String s = "";
		for(int i =0; i< taille; i++){
			for(int j =0; j< taille; j++){
				s+=terrain[i][j];
			}
			s+="\n";
		}
		return s;
	}
	
	public void update(){
		for(int i =0; i< taille; i++){
			for(int j =0; j< taille; j++){
				if(terrain[i][j] != null 
						&& j < taille-1
						&& terrain[i][j+1].getMouton() == null
						&& Math.random() <= 0.2){
					terrain[i][j+1].setMouton(terrain[i][j].getMouton());
					terrain[i][j].setMouton(null);
				}
			}
		}
	}
}
