import java.util.Scanner;
class Main {
  	public static int pow(int a, int b) {
    	int res = 1;
      	while (b != 0) {
        	res *= a;
          	b--;
        }
      	return res;
    }
	public static void main(String[] args ) {
    	Scanner sc = new Scanner(System.in);
      	int a = sc.nextInt();
      	int b = sc.nextInt();
      	System.out.println(pow(a, b));
    }
}