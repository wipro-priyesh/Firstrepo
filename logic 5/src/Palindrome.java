
public class Palindrome {

	public static int output1;
	
    public static void isPalindrome(String input1) 
    {
        String sb = new StringBuffer(input1).reverse().toString();
        
        if(input1.equalsIgnoreCase(sb)){
        	output1 = 1;
        	System.out.println(output1);
        }
        else{
        	output1 = 2;
        	System.out.println(output1);
        }
    }	

    public static void main(String[] args) {
		isPalindrome("dad");
		isPalindrome("qwerty");
	}
	
    
}
