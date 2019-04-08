import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner (System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int noOfParts = in.nextInt();
      solve(str1, str2, noOfParts);
    }
  	public static void solve(String str1, String str2, int tokens) {
    	String[] arrOfStr = str2.split(" ", tokens);
      	for (String str : arrOfStr)
          	System.out.println(str);
    }
}