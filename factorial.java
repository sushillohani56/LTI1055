import java.util.*;
class factorial
{
public static void main(String args[])
{
int n,i,fact=1;
Scanner s=new Scanner(System.in);
System.out.println("Enter number- ");
n=s.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of "+n+" is "+fact);
}
}
