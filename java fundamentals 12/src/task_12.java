import java.util.Scanner;


public class task_12 {

	public static void main(String[] args) {
		boolean con = true;
		Scanner sc = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		
		while (con){
		System.out.println("add");
		System.out.println("sub");
		
		String choice = sc.nextLine();
		
		System.out.println("enter num 1");
		int x = num.nextInt();
		
		System.out.println("enter num 2");
		int y = num2.nextInt();
		
			if(choice.equals("add")){
				int sumadd;
				sumadd = x + y;
				System.out.println(sumadd);
				
			}
			else if(choice.equals("sub")){
				int sumsub;
				sumsub = x - y;
				System.out.println(sumsub);
				
			} 
			
			con = false;
			
		
		System.out.println("enter y to continue");
		String q = sc.nextLine();
		if(q.equals("y")){
			con = true;
		
		}
		
		}
	
	}

	

	
}
