import java.util.Scanner;


public class Last {
	public static int output1;

	
    public static void addLastDigits(int input1, int input2){
    	int x = input1 % 10;
    	int y = input2 % 10;
    	output1 = x + y;
    	System.out.println(output1);
    	
    	
        
    }	
    
    public static void main(String[] args) {
		Last l1 = new Last();
		Last.addLastDigits(123, 23);
	}
}
