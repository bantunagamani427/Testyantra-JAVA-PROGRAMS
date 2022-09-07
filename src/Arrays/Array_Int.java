package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_Int {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		int [] a=new int[size];
		System.out.println("the length of array"+a.length);
		System.out.println("enter the values of an array");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values are:");
		System.out.println(Arrays.toString(a));

	}

}

