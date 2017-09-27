import java.util.Scanner;


public class LastNumber {
	public static void addLastDigits(int input1, int input2){
		/*Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		*/
		
		String x1 = Integer.toString(input1);
		String y1 = Integer.toString(input2);
		
		String x2 = new StringBuilder(x1).substring(x1.length() - 1);
		int num1 = Integer.parseInt(x2);
		System.out.println(x2);
		
		String y2 = new StringBuilder(y1).substring(y1.length() - 1);
		int num2 = Integer.parseInt(y2);
		System.out.println(y2);
		
		int sum = num1 + num2;
		System.out.println("the sum is = " + sum);
	}
	

	public static void main(String[] args) {
		addLastDigits(267, 154);
	}
	
}
