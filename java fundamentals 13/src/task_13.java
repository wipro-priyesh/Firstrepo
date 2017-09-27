
public class task_13 {

	public static void main(String[] args) {
	      int[] array = {1, 2, 3, 5};
     for (int i = 0; i < array.length; i++) {
	         System.out.println(array[i] + " ");
	      }

	      
	      int max = array[0];
	      for (int i = 1; i < array.length; i++) {
	         if (array[i] > max) max = array[i];
	      }
	      System.out.println("Max is " + max);  
	   
	
	  int min = array[0];
      for (int i = 1; i < array.length; i++) {
         if (array[i] < min) max = array[i];
      }
      System.out.println("Max is " + min);  
   }
	}