package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Minimum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values of an array are:"+Arrays.toString(a));


	}
}
