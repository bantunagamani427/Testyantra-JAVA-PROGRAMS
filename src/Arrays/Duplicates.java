package Arrays;

public class Duplicates {

	public static void main(String[] args) {
		int a[]= {2,3,4,1,4,3,5,3,1};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
