import java.util.Scanner;
public class OppositeSign {
    static boolean oppositeSigns (int a, int b) {
        return ((a ^ b) < 0);
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number 1 :-");
        a = s.nextInt();
        System.out.print("Enter the Number 2 :-");
        b = s.nextInt();
        if((oppositeSigns(a, b)) == true)
        {
            System.out.println("Both are Opposite Numbers");
        }
        else
        {
            System.out.println("Both are NOT Opposite Numbers");
        }
    }
}