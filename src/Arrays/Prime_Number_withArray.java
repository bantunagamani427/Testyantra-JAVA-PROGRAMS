package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Prime_Number_withArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scan.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("values of an array:"+Arrays.toString(a));

		for(int i=0;i<a.length;i++) {
			int count=0;
		for(int j=1;j<=a[i];j++) {
			if(a[i]%j==0) {
			count++;	
			}
		}
		if(count==2) {
		System.out.print("prime numbers are:"+a[i]);
	}
	}
}
}