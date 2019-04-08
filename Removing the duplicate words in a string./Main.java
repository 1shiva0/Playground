import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
  	String[] words = new String[10];
    StringBuilder temp = new StringBuilder("");
    int j = 0;
    for (int i = 0; i < str.length(); i++) {
    	if (str.charAt(i) != ' ') {
        	temp.append(str.charAt(i));
        }
      	else if (str.charAt(i) == ' ') {
        	words[j++] =  temp.toString();
        	temp.setLength(0);
        }
    }
    words[j++] = temp.toString();
    
    for	(int i = 0; i < j; i++) {
    	for(int k = i + 1; k < j; k++) {
        	if (words[i].equals( words[k])) words[k] = " ";
        }
    }
    for	(int i = 0; i < j; i++) {
    	if (words[i] == " ") continue;
      	else System.out.print(words[i] + " ");
    }
  }
}