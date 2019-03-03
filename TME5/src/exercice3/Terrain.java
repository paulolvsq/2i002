package exercice3;

public class Terrain {
	private Case[][] terrain;
	public static final int taille = 20;
	
	public Terrain(){
		terrain = new Case[taille][taille];
		for(int i =0; i< taille; i++){
			for(int j =0; j< taille; j++){
				terrain[i][j] = new Case();
				if (Math.random()<= 0.05){
					Bombe b = new Bombe();
					terrain[i][j].setBombe(b);
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
	
	public int update(){
		int res = 0;
		for(int i =0; i< taille; i++){
			for(int j =0; j< taille; j++){
				if(terrain[i][j].getBombe() != null 
						&& terrain[i][j].getExplose() == false){
					if(terrain[i][j+1].getBombe().getTimer() == 0){
						makeExplosion(i, j);
						terrain[i][j+1].explosion();
					}
					else{
						terrain[i][j+1].getBombe().update();
						res++;
					}
				}
			}
		}
		return res;
	}
	
	public void makeExplosion(int k, int l){
		Bombe b = terrain[k][l].getBombe();
		
		for(int i=Math.max(0, b.getX()-b.getPortee());
				 i<Math.min(taille, b.getX()+b.getPortee());
				 i++){
					if(i==b.getX())
						continue;
					if(terrain[i][l].getExplose())
						continue;
		}
	}
}
