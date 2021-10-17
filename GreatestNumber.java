import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter 3 Numbers :-");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>b && a>c)
        {
            System.out.println("Greatest Number is"+a);
        }
        else if (b>a && b>c)
        {
            System.out.println("Greatest Number is"+b);
        }
        else
        {
            System.out.println("Greatest Number is"+c);
        }
    }
}