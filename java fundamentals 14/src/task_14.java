import java.util.Scanner;


public class task_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int x = sc.nextInt();
		
	      int[] array = {1, 2, 3, 5};
   for (int i = 0; i < array.length; i++) {
	   if(x == array[i]){
		   System.out.println(array[i]);
	   }
	   else {
		   System.out.println("-1");
	   }
	   
	       
	}

	}
}

