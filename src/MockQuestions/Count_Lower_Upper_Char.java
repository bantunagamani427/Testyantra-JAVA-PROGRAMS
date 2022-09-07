package MockQuestions;

public class Count_Lower_Upper_Char {

	public static void main(String[] args) {
String s="Manual Automation Java";
int lower=0;
int upper=0;
for(int i=0;i<s.length();i++) {
	char ch = s.charAt(i);
	if(ch>=65&&ch<=95) {
		upper++;
	}
	else {
		lower++;
	}
}
System.out.println("upper"+upper);
System.out.println("lower"+lower);
	}

}
