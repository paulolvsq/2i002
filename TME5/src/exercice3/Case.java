package exercice3;

public class Case {
	private Bombe b;
	private boolean explose;
	
	public Case(Bombe b){
		this.b = b;
		explose = false;
	}
	
	public Case(){
		this(null);
	}
	
	public String toString(){
		if (this.b == null && !explose)
			return "  .";
		else if (explose)
			return "  #";
		else
			return String.format("%3d", b.getNUM());
	}
	
	public void setBombe(Bombe b){
		this.b = b;
	}
	
	public Bombe getBombe(){
		return b;
	}
	
	public void explosion(){
		this.explose = true;
	}
	
	public boolean getExplose(){
		return explose;
	}
}
