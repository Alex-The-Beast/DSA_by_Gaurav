import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsequencesArraylist {
    static ArrayList<String> ssq(String s,int idx){
        ArrayList <String> list=new ArrayList<>();

        //base case
        if(idx>=s.length()){
            list.add("");  // Add empty string representing empty subsequence
            return list;
        };
        //recursive work
        ArrayList<String> newList=ssq(s,idx+1);
        //self work
        for (String element:newList){
            list.add(s.charAt(idx)+element);
        }
         list.addAll(newList);
        return list;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String S=sc.nextLine();
        System.out.println(ssq(S,0));

    }
}

// time complexity is (2^n)
//space complexity is (2^n.n)
