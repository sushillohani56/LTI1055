import java.util.Scanner;
class display
{
public static void main(String args[])
{
String name;
char gender;
int age;
long phone;
double cgpa;
Scanner s=new Scanner(System.in);
System.out.println("Enter name:");
name=s.nextLine();
System.out.println("Enter age");
age=s.nextInt();
System.out.println("Enter Gender");
gender=s.next().charAt(0);
System.out.println("Enter phone no.");
phone=s.nextLong();
System.out.println("Enter cgpa");
cgpa=s.nextDouble();
System.out.println("name: "+name);
System.out.println("age: "+age);
System.out.println("gender: "+gender);
System.out.println("phone no.: "+phone);
System.out.println("cgpa: "+cgpa);
}
}
