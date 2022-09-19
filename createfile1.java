import java.io.*;
class createfile1
{
public static void main(String args[])
{
File f=new File("F:\\java1\\helloworld.txt");
try
{
if(f.createNewFile())
{
System.out.println("File Created Successfully");
}
else
{
System.out.println("File already exist");
}
}
catch(IOException e)
{
System.out.println("Exception Handled");
}
}
}
