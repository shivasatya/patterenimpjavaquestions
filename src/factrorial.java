
public class factrorial {
public static void main1(String[] args) {
	int v =fact(5);
	System.out.println(v);
}

public static int fact(int a) {
	if(a==0) {
		return 1;
	}
	else
	return a*fact(a-1);
}

}
