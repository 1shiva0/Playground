import java.util.Scanner;
public class Main
{
    static Scanner in = new Scanner(System.in);
    public static void main(String args[])
    {
        //Try your code here
      	int choice = in.nextInt();
      	findArea(choice);
    }
  	public static void findArea(int ch) {
    	switch (ch) {
          case 1: 	int s = in.nextInt();
            	  	System.out.println(s * s);
            		break;
          case 2: 	int length = in.nextInt();
            		int breadth = in.nextInt();
            		System.out.println(length * breadth);
            		break;
          case 3: 	int base = in.nextInt();
            		int height = in.nextInt();
            		System.out.println((base * height) / 2 );
            		break;
          case 4:	int r = in.nextInt();
            		System.out.println(3.14 * r * r);
            		break;
        }
    }
}