import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] A = new int[n];
    for (int i = 0; i < n;i++) 
      	A[i] = sc.nextInt();
    int max = 0, curr = 0, max_ele = A[0];
    for (int i = 0; i + 1 < n; i++) {
    	while (i + 1 < n && A[i] == A[i + 1]) { curr++; i++; }
      	if (max < curr) { max = curr; max_ele = A[i]; }
      	curr = 0;
    }
    System.out.println(max_ele);
  }
}