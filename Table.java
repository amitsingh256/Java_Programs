package Java_Examples;

import java.util.Iterator;
import java.util.Scanner;

public class Table {
public static void main(String[] args) {
	System.out.println("Welcome");
	System.out.println("This Program can find table of any number");
	
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	
  
    for (int i=1; i <= 10; i++)
    {
    	System.out.println(a + " * " + i + " = " + a*i);
    }
	
}
}
