
public class revgenkey {
	private static int rev;
	int givenNo;
	
	
	public static void getKey(int input1, int input2, int input3){
		String n1 = Integer.toString(input1);
		String n2 = Integer.toString(input2);
		String n3 = Integer.toString(input3);
		
		
		
		String x = new StringBuilder(n1).reverse().toString();
		System.out.println("reversed - " + x);
		int y1 = Integer.parseInt(n1);
		
		
		String x1 = new StringBuilder(n2).reverse().toString();
		System.out.println("reversed - " + x1);
		int y2 = Integer.parseInt(n2);
		
		String x2 = new StringBuilder(n3).reverse().toString();
		System.out.println("reversed - " + x2);
		int y3 = Integer.parseInt(n3);
		
		
		rev = y1 + y2 + y3;
		System.out.println(rev);
		
		
		
	}
	
	


	public static void main(String[] args) {
		getKey(100,200,300);
	}
}
