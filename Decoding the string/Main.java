import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    StringBuilder str = new StringBuilder(str1);
    int key = sc.nextInt();
    for (int i = 0; i < str.length(); i++) {
    	char ch = str.charAt(i);
      	if (ch >= 'A' && ch <= 'Z') {
          	int offset = ch - 'A';
          	offset = (26 + offset - key) % 26;
          	ch = (char) (offset + 'A');
        }
      	else if (ch >= 'a' && ch <= 'z') {
         	int offset = ch - 'a';
          	offset = (26 + offset - key) % 26;
          	ch = (char) (offset + 'a');	
        }
      	str.setCharAt(i, ch);
    }
    System.out.println(str);
  }
}