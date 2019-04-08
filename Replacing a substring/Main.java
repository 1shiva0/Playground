import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here 
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      System.out.print(s.replace(s1, s2));
    }
}