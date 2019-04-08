import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String res = "";
    for (int i = 0; i < str.length(); i++) {
    	if (!is_vol(str.charAt(i))) {
     		res += str.charAt(i);   	
        }
     }
    System.out.println(res);
  }
  public static boolean is_vol(char a) {
  	if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') return true;
    return false;
  }
}