import java.util.Arrays;
import java.util.Scanner;
class arraydyn
{
public static void main (String args[])
{
int size,i;
System.out.println("Enter size of the array: ");
Scanner s=new Scanner(System.in);
size=s.nextInt();
int a[]=new int[size];
System.out.println("Enter values - ");
for(i=0;i<size;i++)
{
a[i]=s.nextInt();
}
System.out.println(Arrays.toString(a));
}
}
