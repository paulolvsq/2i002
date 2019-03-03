package exercice1;

public class TestDepartement {
	public static void main(String[] args){
		Departement d1 = new Departement();
		for(int i =0; i<65001; i++){
			System.out.println(d1.getPlaque());
		}
	}
}
