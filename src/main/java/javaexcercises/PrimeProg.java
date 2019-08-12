package javaexcercises;

public class PrimeProg {

	public static void main(String[] args) {
		primeProg1();
	}

	public static void primeProg1() {

		int startNum = 1;
		int endNum = 10;
		int counter=0;

		for (int a = startNum; a <= endNum; a++) {
			if (a == 1 || a == 2) {
				System.out.println(+a + " is prime number");
			}

			else if (a % 2 == 0) {
				

			} else {
				for (int b = a; b >= 1; b--) {
					if (b % a == 0) {
						counter = counter+1;

					} 
					if (counter == 2) {
						a=b;
						
					}

				}
				System.out.println(+a+ " is prime number");
			}

		}

	}

}
