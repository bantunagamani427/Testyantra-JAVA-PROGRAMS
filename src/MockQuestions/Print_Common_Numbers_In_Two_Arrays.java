package MockQuestions;

public class Print_Common_Numbers_In_Two_Arrays {

	public static void main(String[] args) {

		int a[]= {12,34,56,10,5,70};

		int b[]= {54,12,67,34,10,9};

		for(int i=0;i<a.length;i++) {

			if(a[i]==b[i]) {

				System.out.println(a[i]);
			}

		}
	}

}
