package Arrays;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int size=scan.nextInt();
		int a[]=new int [size];
		System.out.println("enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values of an array are:");		

		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];	
			}
		}
		System.out.println("the min value of an array is"+min);
	}

}
