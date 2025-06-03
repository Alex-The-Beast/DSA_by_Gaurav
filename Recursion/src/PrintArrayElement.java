import java.util.Scanner;

public class PrintArrayElement {

    static void printArray(int[] arr,int idx){
        // base case
        if (idx==arr.length) return ;

        // self work
        System.out.println(arr[idx]);

        //recursive work

        printArray(arr,idx+1);


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int n=sc.nextInt();
        System.out.println("Enter the element of array.");
        int [] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // this has been printed by for loop.
//        System.out.println("The array are given below");
//        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
//        }

        // this is for recursive iteration;
        printArray(arr,0);

    }
}
