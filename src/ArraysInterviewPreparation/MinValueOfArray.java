package ArraysInterviewPreparation;

public class MinValueOfArray {

	public static void main(String[] args) {
		int[] a= {24,1,8,56};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("min="+min);
	}

}
