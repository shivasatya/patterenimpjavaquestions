
public class FibonacciSeries {
public static void main(String[] args) {
	  int n = 10; // Number of Fibonacci numbers to print
      int first = 0, second = 1;
      
      for(int i=1;i<=n;i++) {
    	  System.out.println(first);
    	 int next  = first+second;
    	 first = second;
    	 second = next;
    	  
      }
	
}
}
