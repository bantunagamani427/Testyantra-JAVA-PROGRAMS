package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Two_Min_withDuplicate {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=scan.nextInt();
		int []a=new int[size];
		System.out.println("the values are:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		System.out.println("the values of an array:"+Arrays.toString(a));
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=fmin) {
				if(a[i]!=fmin) {
					smin=fmin;
				}
				fmin=a[i];
			}
			else if(smin>a[i]||fmin==smin) {
				smin=a[i];	
			}
		}

		System.out.println("the 1st and 2nd minimum values are:"+fmin+" "+smin);	

	}

}
