
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello, world");
		Second s = new Second();
		s.func();
	}

}

class First {
	public int a;
	
}

class Second extends First {
	void func() {
		a= 1;
		System.out.println(a);
	}
}