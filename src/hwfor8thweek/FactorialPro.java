package hwfor8thweek;
import java.util.Scanner;


public class FactorialPro {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int num;
        int i;
        int fact=1;
        System.out.println("Enter a number for finding factorial:- ");
        num=S.nextInt();
        for(i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println(fact);
        }


    }
