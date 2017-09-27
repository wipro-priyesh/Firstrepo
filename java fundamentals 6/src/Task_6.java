import java.util.Scanner;


public class Task_6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter num");
		int x = sc.nextInt();
		
		
		
		System.out.println("enter num 1");
		int y = sc.nextInt();
		
		
		for (int i = x; i <= y; i++) {
			if(i % 2 == 0 )
	        System.out.print(i);
	    }
	}

}
