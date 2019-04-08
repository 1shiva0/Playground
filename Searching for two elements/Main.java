import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      	Scanner in = new Scanner(System.in);
      	int arr_size = in.nextInt();
      	int arr[] = new int[arr_size];
      	for (int i = 0; i < arr_size; i++) {
        	int x = in.nextInt();
          	arr[i] = x;
         }
      	int a = in.nextInt();
      	int b = in.nextInt();
      	int a_i = -1, b_i = -1;
      	for (int i = 0; i < arr_size; i++) {
        	if (arr[i] == a) a_i = i;
          	if (arr[i] == b) b_i = i;
         }
      	System.out.println(a_i);
      	System.out.println(b_i);
    }
}