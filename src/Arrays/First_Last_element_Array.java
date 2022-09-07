package Arrays;

import java.util.Scanner;

public class First_Last_element_Array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of an array");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values of an array");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();

		}
		System.out.println("the first value is"+a[0]); 
		System.out.println("last value"+a[a.length-1]);
		//System.out.println("last value"+a[size-1]);
	}
}
