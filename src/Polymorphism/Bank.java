package Polymorphism;
import java.util.Scanner;
// Example of Method Overriding
public class Bank{
    int nativAmt;
    int interest;
    public void rateOfInter(int nativAmt){

        interest=(nativAmt*10)/100;
        System.out.println("Interest will be " + interest);

    }

    public static void main(String[] args) {
        System.out.println("This is SBI so rate of amount will be 10%");
        Scanner s=new Scanner(System.in);

        Bank B=new Bank();

        System.out.print("Enter a Native amount:- ");
        B.nativAmt=s.nextInt();

        B.rateOfInter(B.nativAmt);
    }
}
