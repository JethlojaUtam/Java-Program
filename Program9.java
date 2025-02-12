//Program 09
//Define a Java class “Person” with instance variables for name and age. Add a method
//to display the details. Create objects of this class and call the method.
import java.util.Scanner;
public class Program9 
{
    String name;
    int age;

    public void disp()
    {
        System.out.println("Your Name is : "+name);
        System.out.println("Your Age is : "+age);
    }

    public static void main(String args[])
    {
        Program9 p1 = new Program9();
        p1.name = "Utamkumar";
        p1.age = 20;
        p1.disp();
    }
}

//run:
//Your Name is : Utamkumar
//Your Age is : 20
