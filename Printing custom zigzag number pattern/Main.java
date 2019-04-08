import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int num = 1;
      	for (int r = 1; r <= n; r++) {
        	if (r % 2 == 1) {
            	for (int c = 1; c < n; c++) {
                	System.out.print(num);
                }
              	num++;
              	System.out.print(num);
              	System.out.println();
            }
          	else {
            	System.out.print(num + 1);
              	for (int c = 1; c < n; c++) {
                	System.out.print(num);
                }
              	num++;
              	System.out.println();
            }
        }
	}
}