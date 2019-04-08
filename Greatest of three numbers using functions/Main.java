import java.util.Scanner;
class Main{
  	public static int greatest (int a, int b, int c) {
    	if (a > b) {
        	if (a > c) return a;
          	else return c;
        }
      	else {
        	if (b > c) return b;
          	else return c;
        }
    }
	public static void main (String[] args){
	    // Type your code here
      	Scanner in = new Scanner(System.in);
      	int a = in.nextInt();
      	int b = in.nextInt();
      	int c = in .nextInt();
      	System.out.println(greatest(a, b, c));
	}
}