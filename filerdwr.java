import java.io.*;
class filerdwr
{
public static void main(String args[])
{
try
{
FileInputStream in=new FileInputStream("output.txt");
FileOutputStream out=new FileOutputStream("input.txt");
int c;
while((c=in.read())!=-1)
{
System.out.print((char)c);
out.write(c);
}
}
catch(IOException e)
{
System.out.println("exception occurs");
}
}
}
