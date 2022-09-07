package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_Number {

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
		boolean status=true;
		  for(int i=0;i<10;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
				status=false;
				break;
			}
		}
		if(status==true) {
			System.out.print(i+" ");
		}
		status=true;
	}

}
}