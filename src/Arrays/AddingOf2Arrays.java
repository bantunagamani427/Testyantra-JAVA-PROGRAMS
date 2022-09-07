package Arrays;

public class AddingOf2Arrays {

	public static void main(String[] args) {
		int []a= {3,8,9,5};
		int []b= {7,1,1,5,8,4};
		int length=a.length;
		for(int i=0;i<length;i++) {
			 length=b.length;
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(Exception e) {
				if(a.length>b.length){
					System.out.println(a[i]);	
				}
				else {
					System.out.println(b[i]);
				}
			}
		}
	}
	}
//int a[]= {3,5,57,6};
//int b[]= {6,4,1,0,5,4};
//int length=a.length;
//for(int i=0;i<length;i++) {
//	length=b.length;
//	try {
//		System.out.println(a[i]+b[i]);
//	}
//	catch(Exception e) {
//		if(a.length>b.length) {
//			System.out.println(a[i]);
//		}
//		else {
//			System.out.println(b[i]);
//		}
//	}
//}
