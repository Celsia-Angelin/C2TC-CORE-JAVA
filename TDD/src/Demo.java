import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Demo {
@RepeatedTest(20)
	void sum()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}


@Test
void display()
{
	System.out.println("Executing TDD");
}
}