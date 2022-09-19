import java.util.*;
class got
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("Enter number 1: ");
a=s.nextInt();
System.out.println("Enter number 2: ");
b=s.nextInt();
System.out.println("Enter number 3: ");
c=s.nextInt();
if(a>b&&a>c)
System.out.println(a+" is greatest");
if(b>a&&b>c)
System.out.println(b+" is greatest");
if(c>a&&c>b)
System.out.println(c+" is greatest");

}
}
