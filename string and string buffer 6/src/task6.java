import java.util.Scanner;


public class task6 {
	String input1;
	
	public static void hi(){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a word");
		String word = sc.next();
		
		int len = word.length()-1;
		char x = word.charAt(len);
		String x1 = Character.toString(x);
		
		if(word.substring(0, 1).equals("x") || x1.equals("x")){
						
			
			
			StringBuilder y = new StringBuilder(word).deleteCharAt(0);
			StringBuilder y1 = new StringBuilder(word).deleteCharAt(len); 	
			
			System.out.println(y);
			System.out.println(y1);
		}
		else{
			System.out.println(word);
		}
		
		
	}

	public static void main(String[] args) {
		hi();
	}
	
}
