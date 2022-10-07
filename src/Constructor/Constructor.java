package Constructor;
import java.util.Scanner;
public class Constructor {
    Scanner s=new Scanner(System.in);

    Constructor(){
        int num1;
        System.out.print("Enter your age:- ");
        num1=s.nextInt();

        if (num1<18 || num1==18){
            System.out.println("You are not eligible for voting");
        }
        else {
            System.out.println("You can go for voting");
        }
    }

    public static void main(String[] args) {
        Constructor c1=new Constructor();

    }
}
