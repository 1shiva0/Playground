import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	System.out.print(sum_(n));
    }
  	public static int sum_(int n) {
    	if (n == 0) return 0;
      	return n + sum_(n - 1);
    }
}