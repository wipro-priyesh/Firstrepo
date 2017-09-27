import java.util.Scanner;


public class Task_3 {
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String x = sc.nextLine();
		
		
		
		System.out.println("enter string 1");
		String y = sc.nextLine();
		System.out.println(x + y);
		

		//part 3 
		String reverse = new StringBuilder(y).reverse().toString();
		System.out.println(x + ""+ reverse); 
}
}