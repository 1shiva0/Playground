import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      print_anticlock(n);
    }
  	public static void print_anticlock(int n) {
    	int mat[][] = new int[n][n];
      	int r_min = 0, r_max = n - 1;
		int c_min = n - 1, c_max = 0;
      	int val = 1;
      	while (r_min <= r_max && c_min >= c_max) {
        	for (int i = c_min; i >= c_max; i--)
              	mat[r_min][i] = val++;
          	for (int i = r_min + 1; i <= r_max; i++)
              	mat[i][c_max] = val++;
          	for (int i = c_max + 1; i <= c_min; i++)
              	mat[r_max][i] = val++;
          	for (int i = r_max - 1; i > r_min; i--)
              	mat[i][c_min] = val++;
          	r_min++;
          	r_max--;
          	c_min--;
          	c_max++;
        }
      	for (int i = 0; i < n; i++) {
        	for (int j = 0; j < n; j++) 
              	System.out.print(mat[i][j] + " ");
          	System.out.println();
        }
    }
}