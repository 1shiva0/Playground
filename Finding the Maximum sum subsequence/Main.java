import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n; i++) 
      	A[i] = sc.nextInt();
    int max_sum = 0, sum = A[0], i = 1;
    while (i != n) {
    	while (i < n && A[i - 1] <= A[i]) {
          	sum += A[i++];
       	}
    	if (sum > max_sum) max_sum = sum;
      	if (i >= n) break;
      	sum = A[i++];
      	
    }
    System.out.print(max_sum);
  }
}