package Inheritance.MultilevelInheri;
import java.util.Scanner;

public class MultiClass extends NumberClass{


    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        MultiClass M=new MultiClass();
        System.out.println("Enter a first number:- ");
        M.firsNum=s.nextInt();
        System.out.println("Enter a second Number:- ");
        M.secNum=s.nextInt();

        System.out.println("Multipliaction is " + (M.firsNum*M.secNum));

    }
}
