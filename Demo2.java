//Program of Addition, Substraction, Multiplication and Divition with Maximum in Java...
import java.util.Scanner; 
public class Demo2 
{
        public static void main(String []args)
        {
            int a,b;
            Scanner sc= new Scanner(System.in);
            System.out.print("Entre a:");
            a=sc.nextInt();
            System.out.print("Enter b:");
            b=sc.nextInt();
            if(a>b)
                System.out.println("MAximum is"+a);
            else
                System.out.println("Maximum is"+b);
            int c=a+b;
            System.out.println("Addition is:"+c );
            int d=a-b;
            System.out.println("Substraction is:"+d);
            int e=a*b;
            System.out.println("Multiplication is:"+e);
            int f=a/b;
            System.out.println("Division is:"+f);
        }
    
}