import java.util.Scanner;

public class Stringreverse {

    static String reverse( String s,int idx){
        //base case
        if(idx>=s.length()) return "";
        //recursive case
        String smallAns=reverse(s,idx+1);
        //self work
        return smallAns+s.charAt(idx);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String.");
        String s=sc.nextLine();
        String result=reverse(s,0);
        System.out.println(result);

    }
}



