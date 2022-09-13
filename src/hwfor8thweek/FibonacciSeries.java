package hwfor8thweek;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum;
        Scanner S=new Scanner(System.in);

        int endNum;
        System.out.println("Enter number for Fibonacci series:- ");
        endNum=S.nextInt();

        int i=0;
        System.out.println("----------- Fibonacci series ------------");
        System.out.println(a);
        System.out.println(b);
        while (i<=endNum)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;
            i++;
        }
    }
}
