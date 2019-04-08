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
      	if (isPal(arr))  System.out.println("Yes") ;
        else System.out.println("No");
    }
  	public static boolean isPal (int[] arr) {
    	int low = 0, high = arr.length - 1;
      	while (low < high) {
        	if (arr[low] != arr[high])
              	return false;
          	low++;
          	high--;
        }
      	return true;
    }
}