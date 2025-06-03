import java.util.Scanner;

public class MaxValue {

    static int maxi(int[] arr ,int idx){

        // base case
        if(idx==arr.length-1) return arr[idx];
        //recursive work
        int smallMaxi= maxi(arr,idx+1);
        //self work
        return Math.max(arr[idx],smallMaxi);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=maxi(arr,0);
        System.out.println("The maximum of the array is :" + result);


    }
}

//time complexity is o(n) and space complexity is o(n).