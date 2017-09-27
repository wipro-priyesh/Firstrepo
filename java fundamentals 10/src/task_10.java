import java.util.Scanner;


public class task_10 {
public static void main(String[] args) {
	System.out.println("enter number");
	Scanner sc = new Scanner(System.in);
	String x = sc.nextLine();
	
	
	if(x.equals(new StringBuilder(x).reverse().toString())){
		System.out.println("is a palindrome");
	}
	else{
		System.out.println("is not a palindrome");
	}
	
}
}
