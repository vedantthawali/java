//Write a java program to check whether the given number is negative or positive//
import java.util.*;
class Seven
{
public static void main (String args[])
{
Scanner scan=new Scanner(System.in);
int a;
System.out.println("Enter a Number");
a=scan.nextInt();
if(a>=0)
{
System.out.println(a+" :Number is positive");
}
else
{
System.out.println(a+" :Number is negative");
}
}
}