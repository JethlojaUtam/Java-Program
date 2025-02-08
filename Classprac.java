//Class Practical
//Write a program to accept a number from user (int/long) and print following output:
//1097->one zero nine seven
import java.util.Scanner;
public class Classprac 
{
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Convert the number to a string
        String numStr = Integer.toString(num);

        // Words for digits 0-9
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numStr.length(); i++) {
            char digitChar = numStr.charAt(i);  // Get the current digit as a character
            int digit = digitChar - '0';  // Convert the character to an integer
            
            // Use if-else statements to print the corresponding word for each digit
            if (digit == 0) 
            {
                System.out.print("zero ");
            } 
            else if (digit == 1) 
            {
                System.out.print("one ");
            } 
            else if (digit == 2) 
            {
                System.out.print("two ");
            } 
            else if (digit == 3) 
            {
                System.out.print("three ");
            } 
            else if (digit == 4) 
            {
                System.out.print("four ");
            } 
            else if (digit == 5) 
            {
                System.out.print("five ");
            } 
            else if (digit == 6) 
            {
                System.out.print("six ");
            } 
            else if (digit == 7) 
            {
                System.out.print("seven ");
            } 
            else if (digit == 8) 
            {
                System.out.print("eight ");
            } 
            else if (digit == 9) 
            {
                System.out.print("nine ");
            }
        }
    }
}

//run:
//Enter a number: 1303
//one three zero three
