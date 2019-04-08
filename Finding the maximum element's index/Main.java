import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    int mx = -12345, in = -1;
    for (int i = 0; i < n; i++) {
    	arr[i] = sc.nextInt();
      	if (arr[i] > mx) {
          mx = arr[i]; 
          in = i;
        }
    }
    System.out.println(in);
  }
}