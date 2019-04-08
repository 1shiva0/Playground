import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a[] = new int[n]; 
    for (int i = 0; i < n; i++) {
    	a[i] = in.nextInt();
    }
    int sum = a[0] + a[1] + a[2];
    for (int i = 3; i < n; i += 3) {
    	if ((a[i] + a[i + 1] + a[i + 2]) != sum) {
         	System.out.println("Not a Perfect Batch");
          	return;
        }
    }
    System.out.println("Perfect Batch");
  }
}