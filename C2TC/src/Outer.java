
public class Outer {
	int x=10;
				static class Inner
				{
					public void demo()  {
						System.out.println("I am Inner Class");
					}
				}

	public static void main(String[] args) {
		Outer.Inner obj=new Outer.Inner();
			obj.demo();
		

	}

}
