package ArraysInterviewPreparation;

public class Sum_Avg_ofAnArray {

	public static void main(String[] args) {
		int a[]= {1,4,1,4,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);
		double avg=sum/a.length;
		System.out.println("avg="+avg);

	}

}
