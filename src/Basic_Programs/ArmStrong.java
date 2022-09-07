package Basic_Programs;

public class ArmStrong {

	public static void main(String[] args) {
		int n=123,rem,res=0,temp=n;
		while(n>0) {
			rem=n%10;
			res=res+(rem*rem*rem);
			n=n/10;
		}
		if(temp==res) {
			System.out.println(temp+" is armstromg");
		}
		else {
			System.out.println(temp+" not armStrong");
		}
	}

}
