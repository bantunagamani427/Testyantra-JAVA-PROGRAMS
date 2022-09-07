package ArraysInterviewPreparation;

import java.util.Arrays;

public class WithoutBubblesort_1st2ndMAX {

	public static void main(String[] args) {
		int a[]= {23,65,1,9,7};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		System.out.println("1st & 2nd max"+fmax+" "+smax);
	}

}
