package StringPractice;

public class SwappingOfStringWithoutVariable {

  public static void main(String[] args) {
	String s="amma";
	String s1="Bannu";
	s=s+s1;
	s=s.substring(0, s.length()-s1.length());
	s1=s1.substring(s1.length());
	System.out.println(s);
	System.out.println(s1);

	
	
	
	
	
	
	
  }
}
	