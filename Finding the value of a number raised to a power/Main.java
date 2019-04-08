import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      	Scanner sc = new Scanner(System.in);
      	int base = sc.nextInt();
      	int exponent = sc.nextInt();
      	System.out.println(pow(base, exponent));
    }
  	public static int pow(int b , int e) {
    	int ans = 1;
      	while (e-- != 0) {
          	ans *= b;
        }
      	return ans;
    }
}