package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenPositionSum_OddSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("enter the values");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();	
		}
		System.out.println("the values are"+Arrays.toString(a));
		int evenSum=0,oddSum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				evenSum=evenSum+a[i];
			}
			else {
				oddSum=oddSum+a[i];
			}
		}
		System.out.println("the sum of even positions:"+evenSum);
		System.out.println("the sum of odd positions:"+oddSum);
	}

}
