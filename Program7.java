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
        System.out.println("2. Even or Odd");
        System.out.println("3. Exit");
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                int no,i,fact=1;
                System.out.print("Enter Number:");
                no=sc.nextInt();
                for(i=1;i<=no;i++)
                {
                    fact=fact*i;
                }
                System.out.println("factorial of "+fact);
                break;
            default:
                System.out.println("Error");
        }
    }
}
