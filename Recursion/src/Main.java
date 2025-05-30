import java.util.Scanner;

public class Main {

    static void printIncreasing(int n){

        // if we will not provide base condition (halting condition) then it will give stackoverflow error .
        if (n==1){
            System.out.println(n);
            return ;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);

        System.out.println("Hello, World!");
    }
}