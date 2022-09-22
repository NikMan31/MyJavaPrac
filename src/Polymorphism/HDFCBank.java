package Polymorphism;
import java.util.Scanner;

public class HDFCBank {
    public void rateOfInter(int nativeAmt){
        int interest;
        System.out.println("This is HDFC Bank");
        interest=(nativeAmt*9)/100;
        System.out.println("Interest will be " + interest);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int nativeAmt;
        HDFCBank H=new HDFCBank();

        System.out.print("Enter a amount:- ");
        nativeAmt=s.nextInt();

        H.rateOfInter(nativeAmt);
    }
}
