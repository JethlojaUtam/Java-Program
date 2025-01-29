//Program of Addition, Substraction, Multiplication and Divition in Java...
import java.util.Scanner; 
public class Demo 
{
        public static void main(String []args)
        {
            int a,b;
            Scanner sc= new Scanner(System.in);
            System.out.print("Entre a:");
            a=sc.nextInt();
            System.out.print("Enter b:");
            b=sc.nextInt();
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
