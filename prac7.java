import java.util.Arrays;
import java.util.Scanner;
class prac7
{
public static void main (String args[])
{
int size,i;
System.out.println("Enter size of the array: ");
Scanner s=new Scanner(System.in);
size=s.nextInt();
String a[]=new String[size];
System.out.println("Enter values - ");
for(i=0;i<size;i++)
{
a[i]=s.next();
}
System.out.println("Before Sorting-");
System.out.println(Arrays.toString(a));
Arrays.sort(a);
System.out.println("After Sorting-");
System.out.println(Arrays.toString(a));
}
}
