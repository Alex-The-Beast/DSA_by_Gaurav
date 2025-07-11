import java.util.Scanner;

public class Power {

    static int power(int a,int b){
        if (b < 0) throw new IllegalArgumentException("Negative exponents not supported.");
        if(b==0) return 1;
        int half=power(a,b/2);
        if(b%2==0)  return half*half;
        return a*half*half;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the base number.");
        int a=sc.nextInt();
        System.out.println("Enter the power.");
        int b=sc.nextInt();
        int result=power(a,b);
        System.out.println("The result is "+ result);
    }
}
