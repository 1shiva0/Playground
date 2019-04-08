import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp_n = n, digits = 0;
      while (temp_n != 0) {
      	digits++;
        temp_n /= 10;
      }
      temp_n = n;
      int cur_dig, num = 0, d = digits;
      while(temp_n != 0) {
      	cur_dig = temp_n%10;
        int t_n = 1;
        for(int i = 0; i < d; i++){
        	t_n *= cur_dig;
        }
        num += t_n;
        temp_n /= 10;
      }
      if(num == n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}