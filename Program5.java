//Program 05
//Write a program that take initial values of students Roll Number, Name, and total
//marks secured in 5 subjects print his/her result as follows:
//a. If percentage &gt;= 70 then result = “Distinction”
//b. If percentage &gt;= 60 and &lt; 70 then result = “First Class”
//c. If percentage &gt;= 50 and &lt; 60 then result = “Second Class”
//d. If percentage &gt;= 40 and &lt; 50 then result = “Pass Class”
//e. Else result = “Fail”.

import java.util.Scanner;
public class Program5 {
    public static void main(String[] args)
    {
        int roll,sub1,sub2,sub3,sub4,sub5,total;
        double per;
        String name;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Roll No.:");
        roll=sc.nextInt();
        System.out.print("Enter Name:");
        name=sc.next();
        System.out.print("Enter the Sub1 mark:");
        sub1=sc.nextInt();
        System.out.print("Enter the Sub2 mark:");
        sub2=sc.nextInt();
        System.out.print("Enter the Sub3 mark:");
        sub3=sc.nextInt();
        System.out.print("Enter the Sub4 mark:");
        sub4=sc.nextInt();
        System.out.print("Enter the Sub5 mark:");
        sub5=sc.nextInt();
        total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total Marks:"+total);
        per=total/5;
        System.out.println("Percentage:"+per);
        if(per>=70)
            System.out.println("The result is Distinction");
        else if(per>=60 && per<70)
            System.out.println("The result is First Class");
        else if(per>=50 && per<60)
            System.out.println("The result is Second Class");
        else if(per>=40 && per<50)
            System.out.println("The result is Pass Class");
        else
            System.out.println("The result is Fail");
    }
    
}

//run:
//Enter the Roll No.:12
//Enter Name:Utam
//Enter the Sub1 mark:98
//Enter the Sub2 mark:80
//Enter the Sub3 mark:79
//Enter the Sub4 mark:85
//Enter the Sub5 mark:65
//Total Marks:407
//Percentage:81.0
//The result is Distinction