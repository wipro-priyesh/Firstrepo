
public class task2 {
	
	String in1;
	String in2;
	String output1;

	public static void concat(String input1, String input2){
		String last = input1.substring(input1.length()-1);
		System.out.println(last);
	
		
		char first1 = input2.charAt(0);
		System.out.println(first1);
		
		StringBuilder x2 = new StringBuilder(input1).deleteCharAt(first1);
		
		System.out.println(x2);
		
		if(last.equals(first1)){
			StringBuilder x1 = new StringBuilder(input1).deleteCharAt(first1);
			
			System.out.println(x1);
			
			//new StringBuilder(input2).deleteCharAt(last);
		
		}else{
			String x = input1 + input2;
			System.out.println(x.toLowerCase());
		}
	}
	
	
	public static void main(String[] args) {
		concat("hello","horld");
	}
}
