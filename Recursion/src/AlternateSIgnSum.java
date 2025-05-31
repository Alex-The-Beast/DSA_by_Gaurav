import java.util.Scanner;

public class AlternateSIgnSum {
    static int alternateSum(int n){
        if (n<0) throw new IllegalArgumentException("The value of n must be positive.");
        if (n==0) return 0;
        if(n%2==0) return alternateSum(n-1)-n;
        return alternateSum(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the non negative  value of n.");
        int n=sc.nextInt();
        System.out.println( "The alternative sum is"+ alternateSum(n));

    }
}
