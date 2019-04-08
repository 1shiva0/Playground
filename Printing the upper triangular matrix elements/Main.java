import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int mat[][] = new int[r][c];
    for (int i = 0; i < r; i++) 
    	for (int j = 0; j < c; j++)
          	mat[i][j] = sc.nextInt();
    for (int i = 0; i < c; i++) {
    	for (int j = i, k = 0; j < r && k < r ; j++, k++) 
          	System.out.print(mat[k][j] + " ");
      		
    }
  }
}