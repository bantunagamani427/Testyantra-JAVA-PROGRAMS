package ArraysInterviewPreparation;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int []a={3,4,1,7,9};
		int key=4;
		for(int i=0;i<key;i++ ) {
			int temp=a[0];
			for(int j=1;j<a.length;j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
