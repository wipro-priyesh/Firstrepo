package logic6;


import java.util.Scanner;

public class LIS {
	public static void main(String[] args) {
		
	
	int input1;
	
		System.out.println("enter number of array");
		Scanner sc = new Scanner(System.in);
	    input1 = sc.nextInt();
		int count = 0;
		int temp = 0;
		int[] input2 = new int[input1];
		for (int i =0;i<input1; i++){
			System.out.println("index" + ": " + (i+1));
			input2[i] = sc.nextInt();
		}
		//1 2 3 4
//		for (int j = 0; j <= input2.length ; j++){
//			if (input2.length ){
//			if(input2[j] <= input2[j+1]){
//				count++;
//			}
//			else if(count > temp){
//					temp = count;
//				}
//			}if(temp >= count){
//				System.out.println(temp);
//			}else{
//				System.out.println(count);
//			}
//		}


	    for(int i=0; i<input2.length; i++){
	        input2[i]=1;
	        for(int j=0; j<i;j++){
	            if(input2[i]>input2[j]){
	                input2[i]=Math.max(input2[i], input2[j]+1);
	            }
	        }
	    }
	 
	    int result = 0;
	    for(int i=0; i<input2.length; i++){
	        if(input2[i]>result)
	            result = input2[i];
	    }
	    System.out.println(result);
	}
	}

int [] array = {1,2,3,4};
int first = array[0];
int i=1;
int count = 0;
int max = 0;
for(i=1; i < array.length; i++){
	if(second > first) {
		count += 1;
	}else{
		if(max < count){
			max = count;
			count =0;
		}
	}
	first = second;
}
System.out.println(max);
	}
}

		
	



