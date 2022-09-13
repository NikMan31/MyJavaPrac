package GitPrac;
import java.util.Scanner;

public class InheritancePrac1 extends InheritancePrac{
    public void sub(){
        int firstNum, secNum;
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter a first number:- ");
        firstNum=obj.nextInt();

        System.out.println("Enter a second number:- ");
        secNum=obj.nextInt();

        int subRes;
        subRes=firstNum-secNum;
        System.out.println("Subtraction is:- " + subRes);
    }

    public static void main(String[] args) {

        InheritancePrac1 c2=new InheritancePrac1();
        c2.sub();



    }

    }
