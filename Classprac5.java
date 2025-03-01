//Class Practical

public class Calender
{
    void add(int...num)
    {
        int sum=0;
        for(int i:num)
        {
            sum=sum+i;
        }
        System.out.println("Addition is "+sum);
    }
    public static void main(String[] args)
    {
        Calender c=new Calender();
        c.add(10,20);
        c.add(10,20,50);
        c.add(10,30,20);
    }
}

//run:
//Addition is 30
//Addition is 80
//Addition is 60