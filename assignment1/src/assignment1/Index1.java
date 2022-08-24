package assignment1;
//class Index
public class Index1 { 
	public static void main(String[] args) {    //main()
		
		
		//Initializing array type Int with name "arr"
        int[] arr= {75,4,56,5,36,100,77,18,29,94};
        
		for(int i=0;i<arr.length;i++)   // For loop with lengh method
		{
			
		if(arr[i]==100)         //search 100 in array
		 {			
		     
			//Printing 100 with index Position
		   System.out.println("100 is at "+i + "th index");
		
		 }     
		
		}      
	}

}   