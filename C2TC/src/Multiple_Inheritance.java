
interface A
{
	void Adisplay();       //It is a declaration

}
interface B
{
	void Bdisplay();       

}
class MIE implements A,B //Multiple Inheritance
{
	public void Bdisplay() {
		System.out.println("Interface A");
	}
	
	public void Adisplay() {
		System.out.println("Interface B");

}
	}

public class Multiple_Inheritance {

	public static void main(String[] args) {
		MIE m=new MIE();
		m.Adisplay();
		m.Bdisplay();
	}
}
