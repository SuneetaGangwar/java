package collections;

public class MakeSentence {

	// Remove '_' and print with 1 space separated string from
	// actual is "Amazon_w_e_b_services_are___widely__used_acc__ro___ss_the_worl_d",
	// output should be : Amazon web services are widely used accross the world.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeSentenceWithSpace();
	}

	static void makeSentenceWithSpace() {
		String text = "Amazon_w_e_b_services_are___widely__used_acc__ro___ss_the_worl_d";
		String expectedOutput = "Amazon web services are widely used accross the world";
		String temp1 = "";
		String finalOutput = "";

		String[] textArr = text.split("_");
		String[] expectedOutputArr = expectedOutput.split(" ");

		for (int a = 0; a < textArr.length; a++) {
			temp1 += textArr[a];
			for (int b = 0; b < expectedOutputArr.length; b++) {
				if (expectedOutputArr[b].equals(temp1)) {
					finalOutput += temp1 + " ";
					temp1 = "";
				}

			}

		}
		System.out.println(finalOutput);

	}

}
