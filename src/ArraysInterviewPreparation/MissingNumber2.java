package ArraysInterviewPreparation;

public class MissingNumber2 {

	public static void main(String[] args) {
		int a[]= {3,1,9,6};
		boolean status=true;
		for(int i=1;i<10;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==a[j]) {
					status=false;
					break;
				}
			}
			if(status==true) {
				System.out.print(i+" ");
			}
			status=true;
		}
	}

}
