package Inheritance.SingleInheri;
import java.util.Scanner;

public class ParentClass {
    int firstNum;
    int secNum;

    Scanner s=new Scanner(System.in);

    public void number(){
        System.out.print("Enter a first number:- ");
        firstNum=s.nextInt();

        System.out.print("Enter a second number:- ");
        secNum=s.nextInt();
    }

    public void add(){
        System.out.println("Addition is " + (firstNum+secNum));
    }


}

