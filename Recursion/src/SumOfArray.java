public class SumOfArray {

    static int sum(int[] arr,int idx){
        //base case
        if (idx==arr.length-1) return arr[idx];
        //recursive call
        int minSum=sum(arr,idx+1);
        //self work
        return minSum+arr[idx];
    }
    public static void main(String[] args) {
        int[] arr={2,3,5,20,1};
        System.out.println("The sum of array is "+ sum(arr,0));

    }
}
