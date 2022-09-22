package Inheritance.MultilevelInheri;
import java.util.Scanner;

public class DivClass extends NumberClass{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        DivClass D=new DivClass();
        System.out.println("Enter a number:- ");
        D.firsNum=s.nextInt();
        System.out.println("Enter a second number:- ");
        D.secNum=s.nextInt();
        if (D.firsNum>D.secNum){
            System.out.println("Divison is " + D.firsNum/D.secNum);
        }
        else {
            System.out.println("Diviso n is " + D.secNum/D.firsNum);
        }

    }
}
