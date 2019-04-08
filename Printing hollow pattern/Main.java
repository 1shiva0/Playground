import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	for (int r = 1; r <= n; r++) {
        	for (int c = 1; c <= n && (r == 1 || r == n); c++ )
            	System.out.print("*");
          	for (int c = 1; c <= n && (r != 1 && r != n); c++) {
            	if (c == 1 || c == n)
                	System.out.print("*");
             	else
                  	System.out.print(" ");
            }
          	System.out.println();
        }
	}
}