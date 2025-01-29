//Program of Addition, Substraction, Multiplication and Divition in Java...
//Using by float
import java.util.Scanner;
public class Demo4 
{
    public static void main(String []args)
        {
            float a,b;
            Scanner sc= new Scanner(System.in);
            System.out.print("Entre a:");
            a=sc.nextFloat();
            System.out.print("Enter b:");
            b=sc.nextFloat();
            float c=a+b;
            System.out.println("Addition is:"+c );
            float d=a-b;
            System.out.println("Substraction is:"+d);
            float e=a*b;
            System.out.println("Multiplication is:"+e);
            float f=a/b;
            System.out.println("Division is:"+f);
        }
}
