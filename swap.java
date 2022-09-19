import java.util.Scanner;
class swap
{
public static void main(String args[])
{
int a,b;
Scanner v=new Scanner(System.in);
System.out.println("Enter value of a: ");
a=v.nextInt();
System.out.println("Enter value of b: ");
b=v.nextInt();
System.out.println("Values after swapping are");
a=a+b;
b=a-b;
a=a-b;
System.out.println("a: "+a);
System.out.println("b: "+b);
}
}
