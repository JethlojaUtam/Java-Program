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
            table=no*i;
            System.out.println("Table:"+no+"x"+i+"="+table);
        }
    }
}

//run:
//Enter Number:10
//Table:10x1=10
//Table:10x2=20
//Table:10x3=30
//Table:10x4=40
//Table:10x5=50
//Table:10x6=60
//Table:10x7=70
//Table:10x8=80
//Table:10x9=90
//Table:10x10=100


