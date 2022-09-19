class obj_arr
{
public static void main(String args[])
{
account a[]=new account[2];
a[0]=new account();
a[0].getdata(4,5);
a[1]=new account();
a[1].getdata(9,7);
}
}
 
class account
{
void getdata(int a,int b)
{
System.out.println(a+" "+b);
}
}
