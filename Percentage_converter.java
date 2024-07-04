package Java_Examples;

import java.util.Scanner;

public class Percentage_converter {
	public static void main(String[] args) {
		System.out.println("hello ! styudent , i am raj");
		System.out.println("get your percentage ");
		Scanner in= new Scanner(System.in);
	    float a,b,c,d,e,result,per;
		System.out.println("enter marks of first subject");
		a= in.nextFloat();
		System.out.println("enter marks of second subject");
		b=in.nextFloat();
		System.out.println("enter marks of third subject");
		c=in.nextFloat();
		System.out.println("enter marks of forth subject");
		d=in.nextFloat();
		System.out.println("enter marks of fifth subject");
		e=in.nextFloat();
		System.out.println("enter total marks");
		float total=in.nextInt();
		result=((a+b+c+d+e)/total)*100;		
		System.out.println("your % = "+result);
	}
}
