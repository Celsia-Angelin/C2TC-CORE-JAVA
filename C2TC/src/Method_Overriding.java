public class Method_Overriding {

	public static void main(String[] args) {
		

	}
}
class Parent
{
	void property()
	{
		System.out.println("Money----House----Jewllery");
	}
	void marry()
	{
		System.out.println("Park Jimin");       //Definition
	}

}
class Child extends Parent
{
	void marry()
	{
		System.out.println("Kim Namjoon");       // New Definition Overriding
	}
}

