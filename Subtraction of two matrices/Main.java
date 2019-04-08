import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int mat1[][] = new int[r][c];
    int mat2[][] = new int[r][c];
    for (int i = 0; i < r; i++) {
    	for (int j = 0; j < c; j++)
          	mat1[i][j] = sc.nextInt();
    }
    for (int i = 0; i < r; i++) {
    	for (int j = 0; j < c; j++)
          	mat2[i][j] = sc.nextInt();
    }
    sub_mat(mat1, mat2);
  }
  public static void sub_mat(int a[][], int b[][]) {
  		for (int i = 0; i < a.length; i++) {
        	for (int j = 0; j < a[i].length; j++)
              	System.out.print(a[i][j] - b[i][j] + " ");
          	System.out.println();
        }
  }
}