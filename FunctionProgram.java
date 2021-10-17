import java.util.Scanner;
public class FunctionProgram
{
    public static void main(String args[])
    {
        int x, y, z, sum1, sum2, mul1, mul2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        System.out.print("Enter the third number: ");
        z = sc.nextInt();
        sum1 = sum1(x, y);
        System.out.println("The sum of two numbers x and y is: " + sum1);
        sum2 = sum2(x, y, z);
        System.out.println("The sum of three numbers x, y and z is: " + sum2);
        mul1 = mul1(x, y);
        System.out.println("The multiplication of two numbers x and y is: " + mul1);
        mul2 = mul2(x, y, z);
        System.out.println("The multiplication of three numbers x, y and z is: " + mul2);
    }
    //method that calculates the sum
    public static int sum1(int a, int b)
    {
        int sum1 = a + b;
        return sum1;
    }
    public static int sum2(int a, int b, int c)
    {
        int sum2 = a + b + c;
        return sum2;
    }
    public static int mul1(int a, int b)
    {
        int mul1 = a * b;
        return mul1;
    }
    public static int mul2(int a, int b, int c)
    {
        int mul2 = a * b * c;
        return mul2;
    }
} 