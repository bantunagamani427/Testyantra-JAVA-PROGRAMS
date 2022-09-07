package ArraysInterviewPreparation;

public class SumOf_Even_Odd_Postions {

	public static void main(String[] args) {
		int a[]= {12,23,0,4,6};
		int evensum=0;
		int oddsum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				evensum=evensum+a[i];
			}
			else {
				oddsum=oddsum+a[i];	
			}
		}
		System.out.println("evensumPosition="+evensum);
		System.out.println("oddsumPosition="+oddsum);
	}
}
