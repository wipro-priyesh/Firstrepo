
public class Task9 {
	int num;
	String word;

	public static void lastThree(String x, int y){
	
		for(int x1 = 0; x1 < y; x1++){
			String word = x.substring(0, y);
			String w = x.substring(x.length() - 3);
			//StringBuilder sb = new StringBuilder(x).
			System.out.println(w);
		}
		
	}
	
	public static void main(String[] args) {
		lastThree("wipro", 3);
	}
	
}
