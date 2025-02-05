//Program 07
//Write a menu driven program which has following operations:
//a. Factorial.
//b. Number is Even or Odd.
//c. Exit.

import java.util.Scanner;
public class Program7 {
    public static void main(String[] args)
    {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Factorial");
        System.out.println("2. Number is Even or Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                int no,i,fact=1;
                System.out.print("Enter Number: ");
                no=sc.nextInt();
                for(i=1;i<=no;i++)
                {
                    fact=fact*i;
                }
                System.out.println("factorial is "+fact);
                break;
            
            case 2:
                int a;
                System.out.print("Enter Number: ");
                a=sc.nextInt();
                if(a%2==0)
                {
                    System.out.println("Number is Even");
                }    
                else
                {
                    System.out.println("Number is Odd");
                }
                break;
            
            case 3:
                System.out.println("Exit");
                break;
                default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
}

//run:
//1. Factorial
//2. Number is Even or Odd
//3. Exit
//Enter your choice: 1
//Enter Number: 5
//factorial is 120

//Enter your choice: 2
//Enter Number: 1
//Number is Odd

//Enter your choice: 3
//Exit

