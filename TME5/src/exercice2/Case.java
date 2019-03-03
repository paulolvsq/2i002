package exercice2;

public class Case {
	private Mouton m;
	
	public Case(){
		this.m = null;
	}
	
	public Case(Mouton m){
		this.m = m;
	}
	
	public String toString(){
		if (this.m == null)
			return "  .";
		else
			return String.format("%3d", this.m.getNUM());
	}
	
	public void setMouton(Mouton m){
		this.m = m;
	}
	
	public Mouton getMouton(){
		return m;
	}
}
