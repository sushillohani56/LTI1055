import java.io.*;
class readfile1
{
public static void main(String args[])
{
try
{
FileInputStream input=new FileInputStream("hello.txt");
int i=0;
while((i=input.read())!=-1)
{
System.out.print((char)i);
}
input.close();
}
catch(Exception e)
{
System.out.print(e);
}
