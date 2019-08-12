package basics;

public class StaticMembers {

	static String name;
	static int number;
	int mobileNo;

	public static void main(String[] args) {

		/*
		 * StaticMembers a = new OtherClass();
		 * 
		 * OtherClass b = new OtherClass(); a.otherStaticMethod();
		 * b.otherStaticMethod();
		 */
		
		StaticMembers.otherStaticMethod();
		

	}

	static void otherStaticMethod() {
		System.out.println("in Main Class");
	}

}

class OtherClass extends StaticMembers {

	static void otherStaticMethod() {
		System.out.println("in Child class Class");
	}

}
