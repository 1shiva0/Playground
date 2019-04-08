import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      	Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
      	int len = str.length();
      	int l = 0, r = len - 1; 
      	boolean isPal = true;
      	while (l < r) {
        	if (str.charAt(l) != str.charAt(r)) {
            	isPal = false;
              	break;
            }
          	l++; r--;
        }
      	if (isPal) System.out.println("Yes");
      	else System.out.println("No");
    } 
}