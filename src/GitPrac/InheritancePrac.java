package GitPrac;
import java.util.Scanner;

public class InheritancePrac {
    public static void add(int firstNum, int secNum){
        int result=firstNum+secNum;
        System.out.println("Addition of 2 number is " + result);
    }
    public static void main(String[] args) {
        int firstNum;
        int secNum;
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter first num:- ");
        firstNum=obj.nextInt();

        System.out.println("Enter second num:- ");
        secNum=obj.nextInt();
        add(firstNum, secNum);

    }
}
