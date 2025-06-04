import java.util.Scanner;

public class PalindromeString {
    static boolean isPalindrome(String s ,int idx ,int last){
        //base case
        if(idx>=last) return true;
        if (s.charAt(idx)!=s.charAt(last)) return false;
        //recursive work
        return isPalindrome(s,idx+1,last-1);
    }
    static String palindrome(String s,int idx){
        //base case
        if(idx>=s.length()) return "";
        //recursive work
        String ans=palindrome(s,idx+1);
        //self work
        return ans+s.charAt(idx);



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string.");
        String s=sc.nextLine();
        int n=s.length();
        if(s.equals(palindrome(s,0))){
            System.out.println("Yes it is palindrome");
        }
        else
            System.out.println("Not a palindrome.");

        System.out.println(isPalindrome(s,0,n-1));
    }

}
//level