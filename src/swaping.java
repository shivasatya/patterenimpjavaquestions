
public class swaping {
public static void main1(String[] args) {
	int a= 10;
	int  b=20;
	int c= a;
	a = b;
	b = c;
	 
	 System.out.println(a);
	 System.out.println(b);
}

public static void main(String[] args) {
	int a= 10;
	int  b=20;
	 b = a+b;
	 a = b-a;
	 b = b-a;
	 System.out.println(a);
	 System.out.println(b);
}
}
