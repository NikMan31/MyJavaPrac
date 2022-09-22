package Polymorphism;
import java.util.Scanner;

public class MethodOverloading1 {
    public int sub(int firstNum, int secNum){
        return firstNum-secNum;
    }

    public void sub(int firstNum, int secNum, int thirdNum){
        System.out.println("Substraction is " + (firstNum-secNum-thirdNum));
    }

    public static void main(String[] args) {
        int firstNum, secNum, thirdNum;
        Scanner s=new Scanner(System.in);

        MethodOverloading1 m1=new MethodOverloading1();

        System.out.println("Enter a firstNumber:- ");
        firstNum=s.nextInt();

        System.out.println("Enter a second Number:- ");
        secNum=s.nextInt();

        System.out.println("Enter a third Number:- ");
        thirdNum=s.nextInt();

        System.out.println("Substraction " + m1.sub(firstNum, secNum));
        m1.sub(firstNum, secNum, thirdNum);
    }
}
