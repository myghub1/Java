import java.util.*;
// Implementation of Selection Sort
public class SelectionSort
{
    public static void selectionSort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            
            int min = i; //Set the first position as minimum
            // Search for the minimum element 
            for (int next = i+1; next<arr.length; next++) 
                if (arr[next] < arr[min])
                    min = next;
  
            /* Swap the minimum element with the first
            element*/ 
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
  
    // Testing
    public static void main(String args[])
    {
        int arr[] = {72,28,10,24,9,16};
         System.out.println("Elements in the array before Sorting: "+ Arrays.toString(arr));
    
    // Calling the selection sort method
        selectionSort(arr);
        System.out.println("Elements in the array after Sorting: "+Arrays.toString(arr));
    }
}