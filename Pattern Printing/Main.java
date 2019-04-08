import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      	Scanner in = new Scanner(System.in);
      	int row = in.nextInt();
      	int col = in.nextInt();
      	for (int r = 0; r < row; r++) {
        	int val = row;
          	for (int c = 0; c < col; c++) {
            	if (r > c) System.out.print(val--);
              	else System.out.print(val);
            }
          	System.out.println();
        }
    }
}