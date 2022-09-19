interface Interface1{
public void f1();
}
interface Interface2 extends Interface1{
public void f2();
}
class x implements Interface2{
public void f1(){
System.out.println("Contents of Method f1() in interface 1");
}
public void f2(){
System.out.println("Contents of Method f2() in Interface2");
}
public void f3(){
System.out.println("Contents of Method f3() of Class X");
}
}
class ExtendingInterface{
public static void main(String args[]){
Interface2 v2;
v2=new x();
v2.f1();
v2.f2();
x xl=new x();
xl.f3();
}
}
