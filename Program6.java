//Program 06
//Write a Java program which accepts any number from command prompt and displays
//the table of multiplication from 1 to 10 of that number.
import java.util.Scanner;
public class Program6 {
    public static void main(String[] args)
    {
        int no,i,table;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        no=sc.nextInt();
        for(i=1;i<=10;i++)
        {
            table=no*1;
            System.out.println("Table:"+no+"x"+i+"="+table);
        }
    }
}

//run:
//Enter Number:10
//Table:10x1=10
//Table:10x2=10
//Table:10x3=10
//Table:10x4=10
//Table:10x5=10
//Table:10x6=10
//Table:10x7=10
//Table:10x8=10
//Table:10x9=10
//Table:10x10=10


