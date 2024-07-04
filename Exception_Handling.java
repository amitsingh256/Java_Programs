package Java_Examples;

import java.util.Scanner;

public class Exception_Handling {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int [] marks =new int[3];
	marks[0]=56;
	marks[1]=78;
	marks[2]=54;
	System.out.println("enter the array index");
	int ind= in.nextInt();
	
	System.out.println("enter number to devide");
	int num=in.nextInt();
	try {
		System.out.println("value of array index is "+ marks[ind]);
		System.out.println(marks[ind/num]);
	} 
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("not possible :");
		System.out.println(e);
	}
	catch (ArithmeticException e) {
		System.out.println("not possible :");
		System.out.println(e);
	}
	catch (Exception e) {
		System.out.println("not possible :");
		System.out.println(e);
	}
	
	
	
}
}
