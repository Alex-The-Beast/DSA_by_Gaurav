public class FrogRecursion {
    static int FrogJump(int [] arr,int idx,int n){
        if(idx==n-1) return 0;
        int op1=Math.abs(arr[idx]-arr[idx+1])+FrogJump(arr,idx+1,n);// for 1-step jump.
        if(idx==n-2) return op1; // if frog is on second last stone then it has only one option so return op1.
        int op2=Math.abs(arr[idx]-arr[idx+2])+FrogJump(arr,idx+2,n);// for 2-step jump.
        return Math.min(op1,op2);
    }
    public static void main(String[] args) {
        int[] arr={10,30,40,20};
        int n=arr.length;
        System.out.println( FrogJump(arr,0,n));
    }
}
