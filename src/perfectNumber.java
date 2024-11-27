import java.util.stream.IntStream;

public class perfectNumber {
public static void main(String[] args) {
	//1+2+3=6 ==>perfernumber
	//1+2+4+7+14=28
	//by multiplying or by getSameNumber
	int number = 6;
	int value =IntStream.range(1, number)
	.filter(x->number%x==0)
	.sum();
	System.out.println(value==number);
}
}
