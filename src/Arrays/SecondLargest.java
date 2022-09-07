package Arrays;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
int []a= {20,45,12,16};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
System.out.println(Arrays.toString(a));

System.out.println("2nd largest="+a[2]);

	}
}
