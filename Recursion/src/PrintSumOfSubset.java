public class PrintSumOfSubset {
    static void printSum(int [] arr,int sum,int idx){
        //base case
        if(idx>=arr.length){
            System.out.println(sum);
            return;
        }
        printSum(arr,sum+arr[idx],idx+1);//add current index
        printSum(arr,sum,idx+1); //not included
    }
    public static void main(String[] args) {
        int[] arr={2,4,5};
        printSum(arr,0,0);
    }
}
