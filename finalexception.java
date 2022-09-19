class finalexception
{
public static void main(String args[])
{
try
{
int d=0;
int n=10;
int f=n/d;
}
catch(ArithmeticException e)
{
System.out.println("in the catch block"+e);
}
finally
{
System.out.println("finally block");
}
}
}