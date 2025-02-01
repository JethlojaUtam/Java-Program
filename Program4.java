//Program 04
//Input three numbers and find minimum among them.

import java.util.Scanner;
public class Program4 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:");
        a=sc.nextInt();
        System.out.print("Enter b:");
        b=sc.nextInt();
        System.out.print("Enter c:");
        c=sc.nextInt();
        if(a<b && a<c)
            System.out.println("A is Minimum");
        else if(b<c)
            System.out.println("B is Manimum");
        else
            System.out.println("C is Manimum");
    }
}

//run:
//Enter a:10
//Enter b:5
//Enter c:15
//B is Manimum
