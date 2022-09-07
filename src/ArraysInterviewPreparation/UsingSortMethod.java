package ArraysInterviewPreparation;

import java.util.Arrays;

public class UsingSortMethod {

	public static void main(String[] args) {
		int a[]= {10,3,7,5,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("1st max"+a[a.length-1]);
		System.out.println("3rd max"+a[a.length-3]);
	}

}
