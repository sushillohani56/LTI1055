import java.io.*;
class deletefile
{
public static void main(String args[]) throws IOException
{
File f=new File("hello.txt");
if(f.delete())
{
System.out.println("File deleted successfully");
}
else
System.out.println("Failed to delete a file");
}
}