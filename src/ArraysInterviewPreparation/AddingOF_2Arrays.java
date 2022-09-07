package ArraysInterviewPreparation;

import java.util.Arrays;

public class AddingOF_2Arrays {

	public static void main(String[] args) {
		int[]a= {45,12,4,2,9};
		int []b= {4,8,2,7};
		
		int [] result=new int[a.length+b.length];
		
		System.arraycopy(a, 0, result, 0, a.length);
		
		System.arraycopy(b, 0, result, a.length, b.length);
		System.out.println(Arrays.toString(result));
	}

}
