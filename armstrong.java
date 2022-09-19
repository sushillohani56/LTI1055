import java.util.Scanner;
class armstrong
{  
public static void main(String[] args)
{  
int x=0,a,temp;  
int n;  
System.out.println("Enter number- ");
Scanner s=new Scanner(System.in);
n=s.nextInt();
temp=n;
while(n>0)  
{  
a=n%10;  
n=n/10;  
x=x+(a*a*a);  
}  
if(temp==x)  
System.out.println("armstrong number");   
else  
System.out.println("Not armstrong number");   
}  
}
