package exercice2;

public class Test {
	public static void main(String[] args){
		Terrain t = new Terrain();
		System.out.println(t.toString());
		for (int i =0; i < 10; i++){
			t.update();
			System.out.println(t.toString());
			try{
			     Thread.sleep(100); // 100 ms
			  }catch(Exception e){
			     e.printStackTrace();
			  }
		}
	}
}
