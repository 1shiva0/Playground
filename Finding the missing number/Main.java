import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
 		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] arr = new int[n];
      	for (int i = 0; i < n; i++) 
          	arr[i] = sc.nextInt();
      	find_unique(arr, n);
    }
  	public static void find_unique(int[] arr, int n) {
    	for (int i = 1; i <= n; i++) {
        	boolean fl = false;
          	for (int j = 0; j < n; j++) {
            	if (i == arr[j]) fl = true;
            }
          	if (!fl) {
             	System.out.println(i);
            	break;
            }
        }
    }
}