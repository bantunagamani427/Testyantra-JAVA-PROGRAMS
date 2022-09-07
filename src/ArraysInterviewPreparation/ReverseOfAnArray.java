package ArraysInterviewPreparation;

import java.util.Arrays;

public class ReverseOfAnArray {

	public static void main(String[] args) {
		int []a= {2,6,1,7};
//		System.out.println("original array:");
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
		
		
		
		System.out.println("reverse of an array:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");

		}
	}
}