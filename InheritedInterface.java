
public class InheritedInterface implements InheritedInterfaceEx,InheritedInterfaceExm {

	public void add(int a,int b)
	{
		System.out.println("Sum = "+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("Difference = "+(a-b));
	}
	public void div(int a, int b)
	{
		System.out.println("Quotient ="+(a/b));
	}
	public void mult(int a, int b)
	{
		System.out.println("Product ="+(a*b));
	}
}
