import java.util.Arrays;
import java.util.Spliterator;

public class ArmstrongNumber {
public static void main(String[] args) {
	int v = 153;
	int TEMP=v; 
	int a=0;
	int sum =0;
	while (TEMP>0) {
		a = TEMP%10;
		TEMP= TEMP/10;
		sum = sum+(a*a*a);
	}
	if(sum ==v) {
		System.out.println("ARMSTRONG NUMBer");
	}
}


}
