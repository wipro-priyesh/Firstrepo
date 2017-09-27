
public class Logic4 {
	
	public static int output1;
	
    public static void identifyHeavy(int[][] x) 
    {
 
        int cornerh = x[0] [0] + x[0] [2] +x[2] [0] + x[2] [2];
        int centerh = x[0] [1] + x[1] [0] +x[1] [2] + x[2] [1];
        
        if(cornerh > centerh){
        	System.out.println("corner-heavy");
        }
        else if(centerh > cornerh){
        	System.out.println("center-heavy");
        }
        else{
        	System.out.println("balanced");
        }
        		
    }  		

    public static void main(String[] args) {
		int[][] x = { {5,1,3}, 
				{2,9,4}, 
				{8,7,6}};
		identifyHeavy(x);
	}
    
}


    



