import java.util.Scanner; 

public class BinarySearch {  
    static int binarySearch(int[] arr, int l, int r, int element) {  
    int mid;  
    if(r >= l)   
    {     
        mid = (l + r)/2;  
        if(arr[mid] == element)  
        {  
            return mid+1;  
        }  
        else if(arr[mid] > element)   
        {  
            return binarySearch(arr,l,mid-1,element);
        }  
        else   
        {  
            return binarySearch(arr,mid+1,r,element);   
        }  
      
    }  
    return -1;   
    }      
    public static void main(String[] args) {  
    int[] arr = {21, 24, 32, 48, 67, 81, 101, 133};  
    int element, result = -1;  
    System.out.println("Please enter a search element");  
    Scanner obj = new Scanner(System.in);  
    element = obj.nextInt();  
    result = binarySearch(arr,0,7,element);  
    if(result == -1)  
        System.out.println("Element not found");  
    else   
        System.out.println("Found element with index: "+ result);     
    }  

}  