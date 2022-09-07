package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class First_Second_max_Without_BubbleSort {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size:");
		int size =scan.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values are:"+Arrays.toString(a));
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}

		}
		System.out.println("the 1st & 2nd max values are:"+fmax+" "+smax);
	}

}
