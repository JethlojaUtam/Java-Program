//Program 10
//Extend the “Person” class from the previous exercise. Create multiple “Person”
//objects, set their attributes, and display their details.
public class Program10 
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
        Program10 p1 = new Program10();
        p1.name = "Utamkumar";
        p1.age = 20;
        p1.disp();
        
        Program10 p2 = new Program10();
        p2.name = "Adarsh";
        p2.age = 19;
        p2.disp();
    }
}

//run:
//Your Name is : Utamkumar
//Your Age is : 20
//Your Name is : Adarsh
//Your Age is : 19
