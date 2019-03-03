package exercice1;

public class Departement {
	private static int id = 1;
	private int NUM_DEPARTEMENT;
	private int NUM;
	private char lettre1;
	private char lettre2;
	
	public Departement(){
		this.NUM_DEPARTEMENT = id;
		id++;
		lettre1 = 'A';
		lettre2 = 'A';
		NUM = 0;
	}
	
	public String getPlaque(){
		gen();
		String s = ""+NUM +" "+ lettre1+lettre2 +" "+ NUM_DEPARTEMENT;
		return s;
	}
	
	public void gen(){
		NUM++;
		if(NUM > 999)
		{
			lettre2++;
			NUM = 1;
			if (lettre2 > 'Z')
			{
				lettre1++;
				lettre2 = 'A';
			}
		}
	}
}
