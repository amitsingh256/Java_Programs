package Java_Examples;

import java.util.Scanner;

public class Pattern_loop {
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	System.out.println("enter a number");
	int n=in.nextInt();
	for(int i=0;i<n;i++) 
	{
	for(int j=0;j<i;j++) {
		System.out.print("*");
	}
	System.out.println("\n");
	}
	
	/*
	 int i;
	for(i=n;i>0;i--) {
		for(int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.println("\n");
	}
	 */
}
}
