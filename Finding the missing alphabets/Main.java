import java.util.Scanner;
class Main{
    public static void main(String args[]){
      // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      int[] arr = new int[26];
      for (int i = 0; i < str.length(); i++) {
      		if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            	arr[str.charAt(i) - 'a']++;
            }
          	else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            	arr[str.charAt(i) - 'A']++;
            }  
      }
      for (int i = 0; i < 26; i++) {
        char ch = (char) (i + 'a');
        if (arr[i] == 0) System.out.print(ch + " ");
      }
     }
}