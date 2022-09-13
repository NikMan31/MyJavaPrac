package hwfor8thweek;
import java.util.Scanner;
import java.util.Random;

public class randEmailAndPass {
    public static void main(String[] args) {
        String emailName;
        String pass;

        Random objForRand=new Random(); // Here, Create object for Random class
        int emailNum=objForRand.nextInt(100);
        int passNum=objForRand.nextInt(10000);

        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name for making Email:- ");
        emailName=s.next();

        System.out.println("Your Email is " + emailName + emailNum+"@gmail.com");
        System.out.println("Your password is "+ emailName+passNum);

    }
}
