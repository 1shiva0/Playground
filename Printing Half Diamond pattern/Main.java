import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	for (int r = 1; r <= n; r++ ) {
        	for (int c = 1; c <= (n - r); c++ )
              System.out.print(" ");
          	for (int c = 1; c <= (2*(r-1) + 1); c++ )
              System.out.print("*");
          	System.out.println();
        }
	}
}