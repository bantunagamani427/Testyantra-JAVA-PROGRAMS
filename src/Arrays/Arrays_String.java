package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_String {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size =scan.nextInt();
		String a[]=new String[size];
		System.out.println("the length of an array:"+a.length);
		System.out.println("enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.next();
		}
		//System.out.println("the values:");
		System.out.println("the values are:"+Arrays.toString(a));
	}

}
