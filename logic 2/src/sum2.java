
public class sum2 {
	public static void digitSum(int input1){
		int sum = 0;
		String input = Integer.toString(input1);
		
		for(int x = 0; x <= input.length(); x++){
			System.out.println(x);
			sum += x;
			System.out.println(sum);
						
		}
		
	}
	
	public static void main(String[] args) {
		digitSum(2501);
	}
}
