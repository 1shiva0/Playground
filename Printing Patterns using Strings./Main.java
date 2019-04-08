import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int len = str.length();
    String s = "";
    for (int i = 0; i < len; i++) {
    	s += str.charAt(((len / 2) + i) % len);
      	for (int j = len - i - 2; j >= 0; j--)
        	  System.out.print(' ');
      	System.out.println(s);
      	
    }
  }
}