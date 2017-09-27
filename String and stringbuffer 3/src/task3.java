import java.util.Scanner;


public class task3 {
	static String input1;

	
	public static void copies(){
		System.out.println("Enter word");
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextLine();
		
		char first = input1.charAt(0);	
		String s1 = Character.toString(first);
		char second = input1.charAt(1);
		String s2 = Character.toString(second);
		String output = s1 + s2;
		
		for(int x =0; x<input1.length(); x++){
			System.out.println(output);
		}
	}
	
	public static void main(String[] args) {
		copies();
		
	}
	
}
