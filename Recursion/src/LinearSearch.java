public class LinearSearch {
    static boolean search(int[] arr,int target,int idx,int n){
        //base case
        if(idx>=n) return false;
        //self work
        if(arr[idx]==target) return true;
        //recursive work
        return search(arr,target,idx+1,n);

    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6,10};
        int target=10;
        if(search(arr,target,0,arr.length)){
            System.out.println("True");
        }
        else System.out.println("False");
    }
}
