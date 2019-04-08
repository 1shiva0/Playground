import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    boolean fl = true;
    int count = 1;
    for (int i = 0; i <= (str1.length() - str2.length() - 1); i++) {
    	fl = true;
      	for (int j = 0; j < str2.length(); j++) {
        	if (str1.charAt(i + j) != str2.charAt(j)) {
            	fl = false;
              	break;
            }
        }
      	if (fl) count++;
    }
    System.out.print(count);
  } 
}