package ArraysInterviewPreparation;

import java.util.Arrays;

public class AcendingOrder {

	public static void main(String[] args) {
		int []a= {23,67,12,9};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("descending order"+Arrays.toString(a));
		System.out.println("1max"+a[a.length-1]);
		System.out.println("2nd element"+a[a.length-2]);
	}

}
