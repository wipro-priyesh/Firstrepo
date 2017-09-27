
public class Sum {
	
	public static int output1;
	static int sum = 0;
	

	public static void digitSum(int input1){
	
		
		
		while(input1 > 0){
			
			int x = input1 % 10;
		    sum = sum + x;
		input1 = input1 / 10;
			
			
		}
			
		System.out.println(sum);
	}
	
	
	
	public static void main(String[] args) {
		Sum.digitSum(84001);
	}
}



