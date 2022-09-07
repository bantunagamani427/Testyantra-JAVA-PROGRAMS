package Arrays;

import java.util.Arrays;

public class RotateArrayByPassingKey {

	public static void main(String[] args) {
		int a[]= {34,45,23,78};
		int key=1;
		for(int i=0;i<key;i++) {
			int temp=a[0];
			for(int j=1;j<a.length;j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
}