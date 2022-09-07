package ArraysInterviewPreparation;

import java.util.Arrays;

public class Copy_ElementsOf_AnArray {

	public static void main(String[] args) {
		int []a= {2,7,9,1};
		System.out.println("the values of an a array:"+Arrays.toString(a));
		int []b=new int[a.length]; 
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("the values of b array"+Arrays.toString(b));

	}
}
