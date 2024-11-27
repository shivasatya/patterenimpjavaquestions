import java.util.Arrays;
import java.util.List;

public class largestNumber {
	public static void main1(String[] args) {
		List<Integer> number = Arrays.asList(23, 4, 5, 67, 2);
		String er = number.stream().sorted((a, b) -> b - a).limit(1).toList().toString();
		System.out.println(er);
	}
	
	public static void main(String[] args) {
		int[] number = { 23, 4, 5, 67, 2,400,4,400 };
		int b = number[0];
		for (int i = 0; i <= number.length - 1; i++) {

			if (number[i] > b) {
				b = number[i];
			}
		}
		System.out.println(b);
	}
}
