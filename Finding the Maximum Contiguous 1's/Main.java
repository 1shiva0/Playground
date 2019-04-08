import java.util.*;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] A = new int[n];
      	for (int i = 0; i < n; i++) 
          	A[i] = sc.nextInt();
      	int max_one = 0, one = 0, i = 0;
      	while (i != n) {
        	while (i < n && A[i] == 1 ) {
            	one++;
            	i++;
            }
          	if (max_one < one) max_one = one;
          	one = 0;
          	while ( i < n && A[i] == 0 ) i++;
          	if (i >= n) break;
        }
      	System.out.println(max_one);
    }
}