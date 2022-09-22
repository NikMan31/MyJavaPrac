package Polymorphism;
import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class MethodOverloading {
    int firstNum, secNum, thirdNum;

    public void add(int firstNum, int secNum, int thirdNum){

        int result=firstNum+secNum+thirdNum;
        System.out.println("this is addition of three number:- " + result);
    }
    public void add(int firstNum, int secNum){
        int result1=firstNum+secNum;

        System.out.println("Addition of 2 number is " + result1);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        MethodOverloading obj=new MethodOverloading();
        System.out.println("Enter a first number:- ");
        obj.firstNum=s.nextInt();

        System.out.println("Enter a second number:- ");
        obj.secNum=s.nextInt();

        System.out.println("Enter a third number:- ");
        obj.thirdNum=s.nextInt();

        obj.add(obj.firstNum, +obj.secNum+ obj.thirdNum);
        obj.add(obj.firstNum, +obj.secNum);
    }
}
