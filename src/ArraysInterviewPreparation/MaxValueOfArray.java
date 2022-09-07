package ArraysInterviewPreparation;

public class MaxValueOfArray {

	public static void main(String[] args) {
		int [] a= {2,23,67,34};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("max"+max);
	}

}
