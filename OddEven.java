import java.util.Scanner;
public class OddEven {
    public static void main(String[] args)
    {
        int x;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number :-");
        x = s.nextInt();
        if(x % 2 == 0)
        {
            System.out.println("The given number "+x+" is Even ");
        }
        else
        {
            System.out.println("The given number "+x+" is Odd ");
        }
    }
}