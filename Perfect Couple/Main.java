import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for (int i = 0; i < n; i++)
        	arr[i] = sc.nextInt();
      int sum = sc.nextInt();
      sum_equal_value(arr, n, sum);
    }
  	public static void sum_equal_value(int arr[], int size, int val) {
      	for (int i = 0; i < size; i++) {
        	for (int j = i + 1; j < size; j++) {
            	if ((arr[i] + arr[j]) == val) {
                	System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    
    }
}