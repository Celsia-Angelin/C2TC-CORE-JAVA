public class StringHandling {

	public static void main(String[] args) {
		String s=new String("Daulat");             //immutable
		s.concat("Ram");
		System.out.println(s);
		
		StringBuffer s1=new StringBuffer("Daulat"); //mutable
		s1.append(" Dagar");
		System.out.println(s1);
	}

}
