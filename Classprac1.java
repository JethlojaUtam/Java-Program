//Write a program rows are decided users if users provides then 
//A 
//AB 
//ABC 
//ABCD 
//ABCDE 
//in java using asci value.

import java.util.Scanner;

public class Classprac1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for input
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        
        // ASCII value for 'A'
        int b = 65;
        
        // Generating the rows
        for (int i = 1; i <= a; i++) 
        {
            for (int j = 0; j < i; j++) 
            {
                // Append characters starting from ASCII value of 'A'
                char k = (char) (b + j);
                System.out.print(k);
            }
            // Print a new line
            System.out.println();
        }
    }
}

//run:
//Enter the number of rows: 5
//A
//AB
//ABC
//ABCD
//ABCDE