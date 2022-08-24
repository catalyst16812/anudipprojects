package assignment1;
import java.util.Arrays;                   

public class Secondlargest {                

	public static void main(String[] args) {     
	
		//Initializingarray type Int with name "number"
		int[] number= {25,14,36,56,15,77,18,29,49};
	
		Arrays.sort(number);
		
		int sec_max = 0;
		
        for(int i=0;i<number.length;i++)                  //for loop with length method 
        {
        	if(number[i]!=number[number.length-1])                
        	{
        		sec_max=number[i];                          //assigning matched array_elemnet value to sec_max
        		
        	 }
        }	
        
       System.out.println(sec_max+" is second largest number in the array");	  //Printing the Second largest
	}

}             