import java.io.*;
class appendfile
{
public static void main(String args[])
{
try
{
FileWriter fw=new FileWriter("output.txt",true);
PrintWriter pw=new PrintWriter(fw);
pw.println("Hello java");
pw.close();
}
catch(IOException ie)
{
ie.printStackTrace();
}
}
}
