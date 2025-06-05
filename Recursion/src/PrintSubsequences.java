public class PrintSubsequences {
    static void printssq(String s,String currAns){
        //base case
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remString=s.substring(1);
        printssq(remString,currAns+curr); //add curr
        printssq(remString,currAns);//do not add curr.
    }
    public static void main(String[] args) {
        printssq("abc","");
    }
}
