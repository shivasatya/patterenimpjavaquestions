import java.util.stream.IntStream;

public class LeapYear {

	public static void main(String[] args) {
		int year = 2025;
		boolean isLeapYear = IntStream.of(year).anyMatch(x -> (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0));
		if (isLeapYear) {
			System.out.println(year + " is a leap year");

		} else {
			System.out.println(year + " is not a leap year");
		}
	}
}
