import java.util.Scanner;
import java.util.stream.IntStream;

public class NumberisEvenOrOdd {

	public static void main1(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();

		if (value % 2 != 0) {
			System.out.println(value + " is Even Number");
		} else {
			System.out.println(value + " is  Prime Number");
		}

	}
	
	public static void main(String[] args) {
		
	boolean value =	IntStream.of(4).anyMatch(x->(x%2==0));
	if(value) {
		System.out.println(value + " is Even Number");
	}
	else {
		System.out.println(value + " is  Prime Number");
	}
	}
	
}
