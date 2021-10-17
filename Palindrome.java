import java.util.Scanner;
public class Palindrome {
 public static void main(String args[]){  
  int x,sum=0,temp;
  int p;
  Scanner s = new Scanner(System.in);
  System.out.print("Enter the Number :-");
  p = s.nextInt();
  
  temp=p;
  while(p>0){
   x=p%10;  //getting remainder
   sum=(sum*10)+x;
   p=p/10;
  }    
  if(temp==sum)    
   System.out.println("It is a Palindrome Number");
  else    
   System.out.println("It is Not a Palindrome");
}  
}