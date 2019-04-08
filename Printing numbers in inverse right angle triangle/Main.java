import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      	Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	for (int r = 1; r <= n; r++) {
        	int num = n - (r-1);
          	for (int c = 1; c <= (n - (r - 1)); c++) {
            	System.out.print(num);
              	num--;
            }
          	System.out.println();
        }
	}
}