import java.util.Scanner;  // Import the Scanner class

public class Sum {
  public static void main(String[] args) {
    int x, sum;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Please enter a positive integer: ");
    x = myObj.nextInt(); // Read user input
    int result = sum(x);
    System.out.println("The sum of the numbers from 1 to the entered number is: "+ result); // Output user input 
  }
  public static int sum(int x) {
    if (x > 0) {
       return x + sum(x - 1);
    } else {
       return 0;
    }
  }
}