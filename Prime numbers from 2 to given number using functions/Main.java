import java.util.Scanner;
class Main{
  	public static void print_prime(int n) {
    	boolean[] P = new boolean[n+1];
      	for (int i = 0; i <= n; i++)
          	P[i] = true;
      	for (int i = 2; i*i <= n; i++) {
        	if (P[i] == true) {
            	for (int j = i*i; j <= n; j += i) {
                	P[j] = false;
                }
            
        	}
        }
      	for (int i = 2; i <= n; i++) {
        	if (P[i]) System.out.println(i);
        }
   	 }
   
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      print_prime(n);
	}
}