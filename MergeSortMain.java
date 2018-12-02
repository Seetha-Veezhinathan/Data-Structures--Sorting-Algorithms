import java.util.Random;
import java.util.Scanner;

public class MergeSortMain {

/* Method to create Randomly Generated Array */
    
    public static int[] genRandomArr()
    {
    	int idx = 0;
  
// Uncomment the value of size according to our required array size
    	int size = 32;
    	//int size = 1024;
    	//int size = 32768;
    	//int size = 1048576;
    	int[] randomArray = new int[size];
    	Random random = new Random();

    	for(int i=0; i < size; i++ )
    	{
    		randomArray[idx] = random.nextInt(99);
    		idx++;
    	}
    	return randomArray;
    }
    
     public static void main(String args[])
	    {
		 	Scanner scan = new Scanner( System.in );  		 	
	    	System.out.println("Merge Sort");
	    	System.out.println("\n1.Sorted Array");
	    	System.out.println("\n2.Reversely Sorted Array");
	    	System.out.println("\n3.Randomly Generated Array");
	    	int input_arr[] = null;
	    	int caseNum = scan.nextInt();
	    	MergeSort ms = new MergeSort();	   
	    	
	    	while(caseNum < 4)
	    	{
	    		switch(caseNum)
	    		    	{	    	
	    		    		case 1:
	    		    	 		int input_arr1[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};	    		
	    		    	 		input_arr = input_arr1;
	    		    	 		System.out.println("Sorted Array \nBefore Sorting");
	    		    	 		break;
	    		    		case 2:
	    		    			int input_arr2[] = {32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
	    		    			input_arr = input_arr2;
	    		    			System.out.println("Reversely Sorted Array \nBefore Sorting");
	    		    			
	    		    			break;
	    		    		case 3:
	    		    			int input_arr3[] = genRandomArr();
	    		    			input_arr = input_arr3;
	    		    			System.out.println("Randomly Generated Array \nBefore Sorting");
	    		    			break;
	    		    		default: System.out.println("Please select any case from 1 to 3");
	    		    	}

	        
	    		ms.printfinalarray(input_arr);
    	 		
    	 		// Calculation for CLOCK TIME
    	        long lStartTime = System.nanoTime(); // start time
    	        ms.COMPCOUNT = 0;
    	        ms.sort(input_arr, 0, input_arr.length-1);
    	        long lEndTime = System.nanoTime(); // end time
    	        long difference = lEndTime - lStartTime; // check different 
    	        
    	        double elapsedtime = (double)difference / 1000000.0;

    	        System.out.println("\nTotal CLOCK time taken: " + elapsedtime + "milliseconds");
    	        System.out.println("\nThe number of Key Comparisons COMPCOUNT is "+ ms.COMPCOUNT +"");   
    	        	        
    	        /* Print sorted Array */
    	        System.out.println("\nElements after sorting ");        
    	        ms.printfinalarray(input_arr);

	    	
	        caseNum = scan.nextInt();
	    	
	    	}

	    }
}
