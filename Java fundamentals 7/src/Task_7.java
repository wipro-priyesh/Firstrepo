import java.util.Scanner;


public class Task_7 {

public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);

	System.out.println("enter num");
	int x = sc.nextInt();
	
	
	
	System.out.println("enter num 1");
	int y = sc.nextInt();
	
	
	for (int i = x; i <= y; i++) {
		for (int j = 2; j < i; j++){
			if(i%j ==0){
				System.out.println(i);
				
			}
		}
}


}
}