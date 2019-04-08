import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      	Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
      	StringBuilder sb = new StringBuilder(str);
      	int len = str.length();
      	reverse_string(sb, 0, len - 1);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      	String str = "", res = "";
      	String[] token = new String[10];
      	int i = 0, j = end_idx, ii = 0;
      	for ( i = 0; i <= j; i++) {
        	if (sb.charAt(i) != ' ')
          		str += sb.charAt(i);
          	else {
            	token[ii++] = str;
              	str = "";
            }
        }
      	token[ii++] = str;
      	for (i = ii - 1; i >= 0; i--) {
          	res += token[i];
          	if (i != 0) res += ' ';
        }
      	System.out.print(res);
    }
}