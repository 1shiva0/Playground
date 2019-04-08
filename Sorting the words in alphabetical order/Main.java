import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String arr[] = new String[n];
    for (int i = 0; i < n ; i++)
      	arr[i] = sc.next().toLowerCase();
    Arrays.sort(arr);
    for (int i = 0; i < arr.length ; i++)
      	System.out.println(arr[i]);
  }
}