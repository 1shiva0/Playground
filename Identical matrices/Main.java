import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here
     Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int mat1[][] = new int[r][c];
    for (int i = 0; i < r; i++) 
    	for (int j = 0; j < c; j++)
          	mat1[i][j] = sc.nextInt();
  	boolean identical = true;
    for (int i = 0; i < r; i++) 
    	for (int j = 0; j < c; j++) {
          	int x = sc.nextInt();
          	if (x != mat1[i][j]) identical = false;
        }
  	if (identical) System.out.println("Yes"); 
    else System.out.println("No");
  }
}