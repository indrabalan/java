package Firstpackage;

interface A12
{
	void a();
	void b();
	void c();
	void d();
}
abstract class B12 implements A12
{
	public void a()
	{
		System.out.println("HELLO");
	}
}
class C12 extends B12
{
	public void b()
	{
		System.out.println("WELCOME 1");
	}
	public void c()
	{
		System.out.println("WELCOME 2");
	}
	public void d()
	{
		System.out.println("WELCOME 3");
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  A12 s = new C12();
		     s.a();
		     s.b();
		     s.c();
		     s.d();
			

	}

}
