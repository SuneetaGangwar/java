package javaexcercises;

/*
 static block is executed only once at the time of class loading 
 static data members memory is allocated only once in class area
 
 */
public class ProgramStatic {

	static int mobile;
	static int number1;
	static String name;
	String nonStatic;
	static {
		name = "Suneeta";
		mobile = 981109999;
		System.out.println("Executing Static Block of ProgramStatic----");
	}

	public ProgramStatic() {
		System.out.println("------Constructor of ProgramStatic");
	}

	public static void main(String[] args) {
		
		int number = 0;
		/*
		 *If Static data members are not initialized than while compilation, a default static block is created and it is initiazed to its default value
		 *Due to which, we do not need to expliceltly initialize the static data members 
		 *Whereas the non-static data members need to be initialized, otherwise we will get compilation error
		 * */
		 
		System.out.println(number1);
		

		System.out.println("Main Method of ProgramStatic----");
		ProgramStatic obj1 = new ProgramStatic();
		
		System.out.println("nonstatic variable from static main method " + obj1.nonStatic);
		System.out.println(obj1.sum(10, 20));
		System.out.println(ProgramStatic.mobile);
		B obj2 = new B();
		System.out.println(obj2.sum(11, 22));

		ProgramStatic obj3 = new ProgramStatic();
		B obj4 = new B();
		System.out.println("End Statement of the Main ----");

	}

	public int sum(int a, int b) {
		return a + b;

	}
}

class B {

	static int bNumber;
	static String bName;

	static {
		System.out.println("Static Block of B Class-----");
		bNumber = 1111111;
		bName = "BNAme";
	}

	public B() {
		System.out.println("----------Constructor of Class B");
	}

	public static int sum(int a, int b) {
		System.out.println("BClass Static sum method");
		return a + b;
	}
}
