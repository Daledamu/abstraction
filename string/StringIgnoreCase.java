package string;

public class StringIgnoreCase {

	public static void main(String[] args) {
		String s1="Sachin";
		System.out.println(s1);
		boolean b=s1.equalsIgnoreCase("Sachin");
		System.out.println(b);
		boolean b1=s1.equalsIgnoreCase("sachin");
		System.out.println(b1);
	

	}

}
