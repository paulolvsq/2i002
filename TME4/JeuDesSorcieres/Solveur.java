
public class Solveur {

	private PlateauJeu j;

	public Solveur(PlateauJeu j){
		this.j = j;
	}

	public PlateauJeu resoudre(){
		PlateauJeu save = j;
		int minError = j.nbError();

		while (minError > 0){
			for(int i = 0; i < 9; i++){ //pour chaque carte
				for(int k = 0; k < 4; k++){ //pour chaque rotation
					j.rotationCard(i);
					if (j.nbError() < minError){
						minError = j.nbError();
						save = j.clone();
						break ;
					}
				}
			}
			if (minError == 0)
				break ;
			//si aucune solution n'a été trouvée on remélange les 9 cartes
			j.randomSwap();
			minError = j.nbError();
		}
		System.out.println("Nombre d'erreurs minimal: "+minError+"\n");
		return save;
	}
}
