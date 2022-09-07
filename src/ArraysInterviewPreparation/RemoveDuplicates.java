package ArraysInterviewPreparation;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int a[]= {23,15,3,23,9,9};
for(int i=0;i<a.length;i++) {
	for(int j=1;j<a.length;j++) {
		if(a[i]==a[j]&&i!=j) {
			System.out.println(a[i]);
		}
	}
}
	}

}
