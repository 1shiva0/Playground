import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String str1 = sc.nextLine();
    int len1 = str1.length();
    int len = str.length();
    boolean fl = false;
    StringBuilder res = new StringBuilder("");
    for (int i = 0; i < len; i++) {
    	char ch = str.charAt(i);
      	fl = false;
      	for (int j = 0; j < len1; j++) {
        	if (ch == str1.charAt(j)) {
            	fl = true;
              	break;
            }
        }
      	if (!fl) res.append(str.charAt(i));
    }
    System.out.print(res);
  }
}