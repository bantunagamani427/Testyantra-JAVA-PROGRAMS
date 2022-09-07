package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Descending_Order {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values are:"+Arrays.toString(a));
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("descending order:"+Arrays.toString(a));
	}

}
