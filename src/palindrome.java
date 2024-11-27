import java.util.Collections;
import java.util.stream.IntStream;

public class palindrome {
	public static void main(String args[]) {
		String value = "235";
	String number =reverseString(value);
	if(number.equals(value)) {
		System.out.println("palidrome");
	}
	else {
		System.out.println(" Not a palidrome");
	}
	
	
	
	}


	static String reverseString(String name) {
		String aa[] = name.split("");
		String reversename = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			reversename = reversename + aa[i];
		}
		return reversename;

	}
	
	

}
