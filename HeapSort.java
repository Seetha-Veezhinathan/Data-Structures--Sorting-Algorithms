// Java program for implementation of Heap Sort

public class HeapSort
{
	int COMPCOUNT = 0;  // Initialize count variable to zero 
	
    public void sort(int arr[])
    {
        int n = arr.length;
 
        // Build heap 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i=n-1; i>=0; i--)
        {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }
 
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
        {
         largest = l;
         COMPCOUNT++;
        }
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
        {
        	largest = r;
        	COMPCOUNT++;
        }
            
       // If largest is not root
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            COMPCOUNT++;
            heapify(arr, n, largest);
            
        }
    }
 
/* Method to print the array */

    public void printfinalarray(int input_arr[])
    {
    	int n = input_arr.length;
        for (int i=0; i<n; i++)
            System.out.print(input_arr[i] + " ");
        System.out.println(); 	
    }

}
