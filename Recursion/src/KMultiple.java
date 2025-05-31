import java.util.Scanner;

public class KMultiple {

    static void  multiple(int n ,int a ){
        if(a<0) throw new IllegalArgumentException("the value of a should be positive");
        if(a==0)  return ;
        multiple(n,a-1);
        System.out.println(n*a);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number .");
        int n =sc.nextInt();
        System.out.println("Enter the value of k.");
        int a=sc.nextInt();
        multiple(n,a);
    }
}
