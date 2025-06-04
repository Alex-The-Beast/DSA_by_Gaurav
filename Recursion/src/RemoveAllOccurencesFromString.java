import java.util.Scanner;

public class RemoveAllOccurencesFromString {
    static String RemoveOccurence(String s,int idx,String target){
        //base case
           if(idx>=s.length()) return "";
        //recursive work
           String ans=RemoveOccurence(s,idx+1,target);
        //self work
           if(s.charAt(idx)!=target.charAt(0)){
               return s.charAt(idx)+ans;
           }else return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string.");
        String s=sc.nextLine();
        System.out.println("The given string is :"+ s);
        System.out.println("Enter the targeted character");
        String a=sc.nextLine();
        String result=RemoveOccurence(s,0,a);
        System.out.println(result);
    }
}
