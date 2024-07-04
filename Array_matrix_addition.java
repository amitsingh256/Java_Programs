package Java_Examples;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Array_matrix_addition {
public static void main(String[] args) {
	/*
	int [][] mat1= {{4},{5},{6},
	                {8},{2},{3}};
	
	int [][] mat2= {{14},{20},{8},
					{1},{4},{7}};
	
	int [][]result={{0},{0},{0},
					{0},{0},{0}};
	
	for(int i=0;i<mat1.length;i++) {                   //row number
		for(int j=0;j<mat1[i].length;j++) {           // column number
			result[i][j] =mat1[i][j]+ mat2[i][j];
			System.out.printf("setting values for i=%d and j=%d\n",i,j);
		}
	}
      for(int i=0;i<mat1.length;i++) {                   //row number
		for(int j=0;j<mat1[i].length;j++) {  
			System.out.println(result[i][j]+"\n" +" ");
			result[i][j] =mat1[i][j]+ mat2[i][j];
			}
	}
   		System.out.println("\n");
   		*/
	
	// reverse of an array
//	Scanner in= new Scanner(System.in);
//	
//	
//	int []arr = {1,2,3,4,5,6,7};
//	System.out.println("element of arrays are :  ");
//	for(int element:arr) {
//		System.out.println( element);
//	}
//	
//	int l =arr.length;
//	int n= Math.floorDiv(l, 2);
//	int temp;
//	
//	for(int i=0;i<n;i++) {
//		temp = arr[i];
//		arr[i]= arr[l-i-1];
//		arr[l-i-1]=temp;
//	}
//	System.out.println("after reverse");
//	for(int element : arr) {
//		
//		System.out.println(element);
//	}
	
	
	// find maximum value in aaray
	int [] arr= {25,65,45,98,78};
	int max=0;
	for(int element:arr) {
		if(element>max) {
			max= element;
		}
		}
	System.out.println("maximum value = " + max);
	
}
}
