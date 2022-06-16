public class StringHandling1 {

	public static void main(String[] args) {
		String s=new String("  Daulat ");             //immutable
		System.out.println(s.length());
		
		String lower=s.toLowerCase();
		System.out.println(lower);
		
		String upper=s.toUpperCase();
		System.out.println(upper);
		
		System.out.println(s.trim());

		System.out.println(s.substring(3));	
		System.out.println(s.substring(3,4));
		
		System.out.println(s.replace('D','C'));	
		
		System.out.println(s.equalsIgnoreCase("daula"));	
		
	}

}
