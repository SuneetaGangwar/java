package javaexcercises;

public class Swap {

	// without using temp variable
	
	public static void main(String[] args) {

int a =10;
int b = 20;

a=a+b;
b=a-b;
a = a-b;
System.out.println("A value " +a+ "B Value " +b);

	}

}
