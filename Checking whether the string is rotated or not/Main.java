import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      	Scanner sc = new Scanner(System.in);
      	String s1 = sc.nextLine();
      	String s2 = sc.nextLine();
      	int l1 = s1.length();
      	int l2 = s2.length();
      	boolean fl = true;
      	StringBuilder temp = new StringBuilder(s1 + s1);
      //	System.out.println(temp);
      	for (int i = 0; i < l1 + l1 - 1; i++) {
        	fl = true;
          	for (int j = 0; j < l2; j++) {
            	if (temp.charAt(i + j) != s2.charAt(j)) {
                  fl = false;
                  break;
                }
            }
          	if (fl) {
              System.out.print("Yes");
              break;
            }
        }
      	if(!fl) System.out.println("No");
    }
}