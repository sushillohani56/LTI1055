import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
int l,i;
String str,rev="";
System.out.println("Enter the string- ");
Scanner s=new Scanner(System.in);
str=s.next();
l=str.length();
for(i=l-1;i>=0;i--)
{
rev=rev+str.charAt(i);
}
if(str.equals(rev))
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not Palindrome");
}
}
}
