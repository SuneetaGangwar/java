package basics;

public class SwitchProg {
	// default run when there is no matching
	// if there is break statement in matching case than next statement runs
	public static void main(String[] args) {
		int a = 6;
		switch (a) {
		case 1:
			System.out.println("number is 1: ");
			break;

		case 5:
			System.out.println("number is 5:");
			break;
		case 2:
			System.out.println("number is 2:");
			break;

		default:
			System.out.println("in default block---");
		}

	}

}
