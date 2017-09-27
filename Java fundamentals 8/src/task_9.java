import java.util.Scanner;


public class task_9 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 Scanner sc1 = new Scanner(System.in);
	
	System.out.println("enter gender"); 	 
	String gender = sc.nextLine();
	
	System.out.println("enter age");
	int age = sc.nextInt();
	
	if (gender.equals("female") && (age >= 1 && age <= 58) ){
		System.out.println("intrest is 8.2%");
	}
	else if (gender.equals("female") && (age >= 59 && age <= 120) ){
		System.out.println("intrest is 7.6%");
	}
	else if (gender.equals("male") && (age >= 1 && age <= 60) ){
		System.out.println("intrest is 9.2%");
	}
	else if (gender.equals("male") && (age >= 61 && age <= 120) ){
		System.out.println("intrest is 7.6%");
	}
}
}
