public class Method_overloading {

	public static void main(String[] args) {
		Test t=new Test();
		t.m();
		t.m(56);   //It is a method call....exact match is searched 
	}

}

class Test
{
	public void m()
	{
		System.out.println("No arguments");
	}
	public void m(int i)
	{
		System.out.println("Integer arguments");
	}
	public void m(double d)
	{
		System.out.println("Double arguments");
	}
}