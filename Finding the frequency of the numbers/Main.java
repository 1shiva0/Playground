import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int k = sc.nextInt();
      	int[] arr = new int[n];
      	int[] map = new int[k + 1];	
     	for (int i = 0; i < n; i++) {
          	arr[i] = sc.nextInt();
        	map[arr[i]]++;
        }
      	for (int i = 1; i <= k; i++) 
        	System.out.println(i + " " + map[i]);
    }
}