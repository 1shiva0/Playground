import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder temp = new StringBuilder("");
    for (int i = 0; i < str.length(); i++) {
      	if (str.charAt(i) != ' ') {
        	temp.append(str.charAt(i));
        }
      	else {
        	reverse(temp);
          	System.out.print(" ");
          	temp.setLength(0);
        }
      	if (i == str.length() - 1) {
        	reverse(temp);
        }
    }
  }
  public static void reverse(StringBuilder rev) {
  	for (int i = rev.length() - 1; i >= 0; i--)
      	System.out.print(rev.charAt(i));
  }
}