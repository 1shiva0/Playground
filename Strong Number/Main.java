import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int temp_n = n, d, num = 0;
      while(temp_n != 0) {
      	d = temp_n % 10;
        num += fact(d);
        temp_n /= 10;
      }
      if(n == num)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
  public static int fact(int n) {
  	int ans = 1;
    for(int i = 1; i <= n; i++)
      ans *= i;
    return ans;
  }
}