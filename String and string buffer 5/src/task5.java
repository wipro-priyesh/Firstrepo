import java.util.Scanner;


public class task5 {

	String input1;
	
	
	public static void chars(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a word");
		String x = sc.nextLine();
		if(x.length() > 2){
			int len = x.length() - 1;
			String y = x.substring(1, len);
			System.out.println(y);
		}
		else{
			System.out.println("Enter a longer word");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		chars();
	}
}
