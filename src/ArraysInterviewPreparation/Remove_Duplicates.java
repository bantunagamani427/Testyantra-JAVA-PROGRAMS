package ArraysInterviewPreparation;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int []a= {1,1,3,3,4,6,8};
		int k=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				a[k]=a[i];
				k++;
			}
		}
		a[k]=a[a.length-1];	
		for(int i=0;i<k;i++) {
			System.out.println(a[i]+" ");	
		}
	}

}



