package ArraysInterviewPreparation;

public class PrintDuplicates {

	public static void main(String[] args) {
		int a[]= {1,4,1,4,7,2};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]+" ");
				}
			}
		}
	}

}
