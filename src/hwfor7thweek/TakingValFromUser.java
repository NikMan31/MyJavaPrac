package hwfor7thweek;
import java.util.Scanner;

public class TakingValFromUser {
    public static void main(String[] args) {
        int firstNum, secNum, Sum;
        Scanner S=new Scanner(System.in);
        System.out.print("Enter 1st number:- ");
        firstNum=S.nextInt();

        System.out.print("Enter 2nd number:- ");
        secNum=S.nextInt();

        Sum=firstNum+secNum;
        System.out.println("Addition of 2 number:- " + Sum);
    }
}
