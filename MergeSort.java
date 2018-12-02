/* Java program for Merge Sort */

public class MergeSort
{
	
    int COMPCOUNT = 0;  // Initialize count variable to zero 
     
/* Method to merge the two sub array to a single sorted array */
    public void merge(int arr[], int l, int m, int r)
    {
        int n1 = m - l + 1;
        int n2 = r - m;

// Create two temporary array & Store the values in them
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
// Initial index of first and second sub array are initialized to zero
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
            COMPCOUNT++;
        }
        
// Copy the remaining elements from first sub array if any 
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
// Copy the remaining elements from first sub array if any
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }

   }

  
/* Method to sort */
    public void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
             int m = (l+r)/2;
             sort(arr, l, m);
             sort(arr , m+1, r);
             merge(arr, l, m, r);
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