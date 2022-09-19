interface printable
{
void print();
}
interface showtable
{
void show();
}

class Interface1 implements printable,showtable
{
public void print()
{
System.out.println("1st Interface");
}
public void show()
{
System.out.println("2nd Interface");
}
public static void main(String args[])
{
Interface1 obj=new Interface1();
obj.print();
obj.show();
}
}