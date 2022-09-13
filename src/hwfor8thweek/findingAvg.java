package hwfor8thweek;
import java.util.Scanner;

public class findingAvg {
    public static void main(String[] args) {
        Scanner objForScan=new Scanner(System.in);
        System.out.println("Enter first number:- ");
        int firstNum=objForScan.nextInt();
        System.out.println("Enter second number:- ");
        int secNum=objForScan.nextInt();

        System.out.println("Avarage of givem number is " + (firstNum+secNum)/2);
    }
}
