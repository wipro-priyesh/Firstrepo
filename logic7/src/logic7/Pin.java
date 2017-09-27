package logic7;

import java.util.Scanner;

public class Pin {
	
    public static int output1;
    
    static int unit;
    static int tens;
    static int hundered;
	
    public static void CreatePin(int alpha, int beta, int gamma){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter alpha");
//        alpha = sc.nextInt();
//        System.out.println("enter beta");
//        beta = sc.nextInt();
//        System.out.println("enter gamma");
//        gamma = sc.nextInt();
        
        alpha = alpha % 10;
        System.out.println(alpha);
//        beta = (beta / 10) % 10;
//        System.out.println(beta);
//        String g1 = Integer.toString(gamma);
//        g1 = g1.substring(0, 1);
//        gamma = Integer.parseInt(g1);
//        System.out.println(g1);
        
    	if(beta > 10){
    		beta = (beta / 10) % 10;
            System.out.println(beta);
        }
    	else{
    		beta = beta;
        	}
        	
    	if(gamma == 0){
        	gamma = 900;
        }
        if (gamma <= 99) {
        	gamma = gamma % 10;
        	
        }
        if (gamma >= 99){
        	String g1 = Integer.toString(gamma);
            g1 = g1.substring(0, 1);
            gamma = Integer.parseInt(g1);
            
            
            System.out.println(gamma);
        }
        
        
        System.out.println(gamma + "" +  beta + "" + alpha);
    }	
    
    

    public static void main(String[] args) {
		CreatePin(123, 456, 789);
	}

}
