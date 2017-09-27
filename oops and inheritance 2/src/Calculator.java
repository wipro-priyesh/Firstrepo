
public class Calculator {
	
	int number1;
	int number2;

	
	public static int powerInt(int num1,int num2){
		int num4;
		num4 = (int) Math.pow(num1, num2);
		return num4;
		
	}
	
	
	
	
	public static double powerDouble(double num1,int num2){
		
		double num3;
		num3 = Math.pow(num1, num2);
		
		return num3;
	}
	
	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(10,10));
		System.out.println(Calculator.powerDouble(2, 2));
	}
	
}
