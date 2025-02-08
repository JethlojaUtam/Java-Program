//Write a program of rows are decided users if users provides then 
//A 
//AB 
//ABC 
//ABCD 
//ABCDE

import java.util.Scanner;

public class Classprac2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        // Prompting user for input
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        
        // Generating the rows
        for (int i = 1; i <= a; i++) 
        {
            StringBuilder row = new StringBuilder();  // To hold the current row's letters
            for (int j = 0; j < i; j++) 
            {
                // Append characters starting from 'A' (ASCII 65)
                row.append((char) ('A' + j));
            }
            // Print the current row
            System.out.println(row);
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