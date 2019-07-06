package javaexcercises;

/*
 * Class to represent tickets as object. Each ticket should have a unique number and value
 * Count and total value of the sold tickets are to be maintained as summary
 */
class TicketTest {

	public static void main(String[] args) {
		System.out.println("Selling some tickets ");

		Ticket t1 = new Ticket(100);
		Ticket t2 = new Ticket(200);
		Ticket.summary();
		System.out.println("Details of first ticket: ");
		t1.details();
		System.out.println("Details of second ticket: ");
		t2.details();

	}

}

class Ticket {

	private int value, no; // object attributes

	private static int total, count; // class attributes

	// class initializer
	static {
		total = 0;
		count = 0;
	}

	// object initializer
	public Ticket(int v) {

		value = v;
		total = total + value; // ticket value is added to the total
		no = ++count; // counter is increased and its value is used as ticket number

	}

	// class behaviour
	public static void summary() {
		System.out.println(count + " ticket of Rs " + total + " are sold.");

	}

	// object behaviour
	public void details() {
		System.out.println("No : " + no);
		System.out.println("Value : " + value);
	}
}
