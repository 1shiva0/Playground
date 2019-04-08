import java.util.*; 
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr1[] = new int[n / 2];
    int arr2[] = new int[n];
    for (int i = 0; i < n / 2; i++)
      	arr1[i] = sc.nextInt();
    for (int i = n / 2; i < n; i++)
      	arr2[i] = sc.nextInt();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    for (int i = 0; i < n / 2; i++)
      	System.out.print(arr1[i] + " "); 
    for (int i = n - 1 ; i >= n / 2; i--)
      	System.out.print(arr2[i] + " ");
  }
}