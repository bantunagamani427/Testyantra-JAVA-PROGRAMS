package Arrays;

import java.util.Scanner;

public class Sum_Avg {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=scan.nextInt();
		
		int [] a=new int[size];
		System.out.println("enter the values are:");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt(); 
		}
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i]; 
		}
		System.out.println("sum of values:"+sum);
		double avg=sum/a.length;
		System.out.println("avg of numbers"+avg);
		System.out.println("amma");
	}

}
