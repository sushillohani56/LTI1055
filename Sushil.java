class student
{
String ss;
String name;
public student(String ss)
{
name = ss;
}
public student()
{
name = "unknown";
}
}
public class Sushil
{
public static void main (String args[])
{
student obj = new student();
obj.ss = "Manish";
//Student ss1 = new Student();
System.out.println(obj.ss);
System.out.println(obj.name);
}
}