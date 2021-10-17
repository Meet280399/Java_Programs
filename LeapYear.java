import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
        int y;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Year :-");
        y = s.nextInt();
        if(y % 4 == 0)
        {
            System.out.println("The given Year "+y+" is Leap Year ");
        }
        else
        {
            System.out.println("The given Year "+y+" is not a Leap Year ");
        }
    }
}