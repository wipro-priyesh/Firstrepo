import java.util.Scanner;


public class Task_1 {
	
	
	public static void main(String[] args) {	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a word");
	String input = sc.nextLine();

	pal(input);
	
	System.out.println("Continue Y/N");
	String con1 = sc.nextLine();
	
	if(con1.equals("y")){
		System.out.println("enter a word");
		String input1 = sc.nextLine();
		pal(input1);
	}
	else if(con1.equals("n")){
		System.out.println("bye");
	}
	
	}
	
	
	
	public static void pal(String y){
		String rev1 = new StringBuilder(y).reverse().toString();
		if(y.equals(rev1)){
			System.out.println("is a palindrome");
		}
		else{
			System.out.println("is not a palindrome");
		}
	}
}
	