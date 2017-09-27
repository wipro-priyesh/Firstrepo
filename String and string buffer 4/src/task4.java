import java.util.Scanner;


public class task4 {
	String input1;
	
	private static void even(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter word");
	String x = sc.nextLine();
	 
	 if (x.length() % 2 == 0){
		 int len = x.length() / 2;
		 System.out.println(x.substring(0, len));
		 
	 }
	 else{
		 System.out.println("null");;
		 
	 }
	}
	
	public static void main(String[] args) {
		even();
	}
	
	
}
