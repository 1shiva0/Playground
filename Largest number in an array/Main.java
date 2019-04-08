import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      	Scanner in = new Scanner(System.in);
      	int arr_size = in.nextInt();
      	int mx = -1;
      	for (int i = 0; i < arr_size; i++) {
        	int x = in.nextInt(); 
          	if (x > mx) mx = x;
        }
      	System.out.println(mx);
    }
}