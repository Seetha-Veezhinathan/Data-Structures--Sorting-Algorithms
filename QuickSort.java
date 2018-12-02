public class QuickSort 
{
	 public static int COMPCOUNT = 0;  // Initialize count variable to zero 
	
	    /* Quick Sort function */
	    public static void sort(int[] arr)
	    {
	        quickSort(arr, 0, arr.length - 1);
	    }
	    /* Quick sort function */
	    public static void quickSort(int arr[], int low, int high) 
	    {
	        int left = low;
	        int right = high;
	        int pivot = arr[(low + high) / 2];
	 
	        /* Divide and compare the pivot */
	        while (left <= right) 
	        {
	            while (arr[left] < pivot)
	            {
	            	left++;
		            COMPCOUNT++;
	            }
	                
	            while (arr[right] > pivot)
	            {
	            	right--;
		            COMPCOUNT++;
	            }
	                
	            if (left <= right) 
	            {
	            	swap(arr,left,right);
	                left++;
	                right--;
	            }
	        }
	 
	        /* recursively sort lower half */
	        if (low < right)
	            quickSort(arr, low, right);
	        /* recursively sort upper half */
	        if (left < high)
	            quickSort(arr, left, high);
	    }		
	
	public static void swap(int[] array, int i, int j) 
		{
			int tmp = array[i];
			array[i] = array[j];
			array[j] = tmp;
		}
    
/* Method to print the array */

    public static void printfinalarray(int input_arr[])
    {
    	int n = input_arr.length;
        for (int i=0; i<n; i++)
            System.out.print(input_arr[i] + " ");
        System.out.println(); 	
    }
}
