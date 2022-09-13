package hwfor7thweek;
import java.util.Scanner;

public class DynamicSwitchCase {
    public static void main(String[] args) {
        int num;
        Scanner S=new Scanner(System.in);
        System.out.println("Press 1 for Pizza");
        System.out.println("Press 2 for Manchurian");
        System.out.print("Enter a number 1 or 2 for ordering:- ");
        num=S.nextInt();
        switch (num){
            case 1:
                System.out.println("You have ordered pizza");
                break;
            case 2:
                System.out.println("You have ordered Manchurian");
                break;
            default:
                System.out.println("You entered wrong number");
        }

    }
}
