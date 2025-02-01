//Program 03
//Write program to input length and width and calculate the area of the rectangle.

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args)
    {
        int len,wid,area;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter len:");
        len=sc.nextInt();
        System.out.print("Enter wid:");
        wid=sc.nextInt();
        area = len*wid;
        System.out.println("Area of Rantangle:"+area);
    }
}

//run:
//Enter len:5
//Enter wid:5
//Area of Rantangle:25
