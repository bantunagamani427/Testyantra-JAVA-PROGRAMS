package Arrays;

public class ArrayDeclaration_2Ways {

	public static void main(String[] args) {
		int a[]={76,436,43,3,5,7};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int b[]=new int [4];
		b[0]=34;
		b[1]=2;
		b[3]=5;

		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);	
		}


	}
}