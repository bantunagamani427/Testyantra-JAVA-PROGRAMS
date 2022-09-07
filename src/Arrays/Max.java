package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the size of an array:");
		int size =scan.nextInt();
		int a[] =new int[size];
		System.out.println("enter the values of an array:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}

	System.out.println("the values of an array are:"+Arrays.toString(a));	
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("the max value of an array "+max);
	}

}
