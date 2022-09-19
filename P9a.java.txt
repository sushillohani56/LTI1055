package p3_top_10;
import java.util.Scanner;

public class P9a {
	static double circle(double r) {
		double area=3.14*r*r;
		return area;
	}
	static double rectangle(double l, double w) {
		double area=l*w;
		return area;
	}
	static double triangle(double b, double h) {
		double area=0.5*b*h;
		return area;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Sushil-01021402019");
		System.out.println("Choose form list");
		System.out.println("1: Area of circle");
		System.out.println("2: Area of Rectangle");
		System.out.println("3: Area of triangle");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("Enter radius of  circle");
			double radius=sc.nextDouble();
			double a=circle(radius);
			System.out.println("Area of the circle is "+a);
			break;
		}
		case 2:{
			System.out.println("Enter Length of rectangle");
			double Length=sc.nextDouble();
			System.out.println("Enter Breath of rectangle");
			double Breath=sc.nextDouble();
			double b=rectangle(Length,Breath);
			System.out.println("Area of the rectangle is "+b);
			break;
		}
		case 3:{
			System.out.println("Enter base of triangle");
			double base=sc.nextDouble();
			System.out.println("Enter heigth of triangle");
			double height=sc.nextDouble();
			double c=triangle(base,height);
			System.out.println("Area of the triangle is "+c);
			break;
		}	
		}
		
	}
}
