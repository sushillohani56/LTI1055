class outer
{
void outmethod()
{
class inner
{
void inmethod()
{
System.out.println("Inner class");
}
}
inner i=new inner();
i.inmethod();
}
public static void main(String args[])
{
outer c=new outer();
c.outmethod();
}
}
