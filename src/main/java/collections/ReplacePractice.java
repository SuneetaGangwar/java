package collections;

public class ReplacePractice {
	
	
//program to replace all spaces with single space
	public static void main(String[] args) {
		String text = "I am  in   FIS";
		System.out.println(text.trim().replaceAll("\\s+", " "));
		
		//StringUtils.normalizeSpace(String text)

	}

}
