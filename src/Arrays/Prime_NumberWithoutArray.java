package Arrays;

public class Prime_NumberWithoutArray {

	public static void main(String[] args) {
		int [] a= {2,6,1,7,8,45};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;	
				}
			}
			if(count==2) {
				System.out.println("prime numbers are:"+a[i]);
			}
		}
	}
}
