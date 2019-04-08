import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	for (int r = 1; r <= n; r++ ) {
        	for (int c = 1; c <= n; c++ ) {
            	if (r == c || (r + c) % (n + 1) == 0) 
                	System.out.print("*");
              	else
                  	System.out.print(" ");
            }
          	System.out.println();
        }
	}
}