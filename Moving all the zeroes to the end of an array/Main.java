import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int [n];
      int ans[] = new int [n];
      for (int i = 0; i < n; i++) 
        	arr[i] = in.nextInt();
      int count_zero = 0, j = 0;
      for (int i = 0; i < n ; i++) {
        	if (arr[i] == 0) count_zero++;
      		else ans[j++] = arr[i];
      }
      while (count_zero != 0) {
      		ans[j++ ] = 0;
        	count_zero--;
      }
      for (int i = 0; i < n ; i++)
        	System.out.print(ans[i] + " ");
    }
}