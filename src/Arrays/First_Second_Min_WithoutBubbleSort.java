package Arrays;

public class First_Second_Min_WithoutBubbleSort {

	public static void main(String[] args) {
int a[]= {43,67,2,9};
int fmin=a[0];
int smin=a[0];
for(int i=0;i<a.length;i++) {
	if(a[i]<fmin) {
		smin=fmin;
		fmin=a[i];
	}
	else if(a[i]<smin) {
	smin=a[i];
	}
}
	System.out.println("1st and 2nd min numbers:"+fmin+" "+smin);
	}

}
