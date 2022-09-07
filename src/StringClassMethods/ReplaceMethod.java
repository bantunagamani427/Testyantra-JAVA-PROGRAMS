package StringClassMethods;

public class ReplaceMethod {

	public static void main(String[] args) {
		String s="bannu";
		System.out.println(s.replace('b', '1'));
		System.out.println(s.replace("nn", "jk"));
		System.out.println(s.replace("bannu", "bittu"));
		System.out.println(s.replaceAll("[aeiou]", "mama"));
		System.out.println(s.replaceAll("[a-z,A-Z]", "2"));
		System.out.println(s.replaceFirst("b", "k"));
	}

}
