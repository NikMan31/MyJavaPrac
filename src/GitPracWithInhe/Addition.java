package GitPracWithInhe;
import java.util.Scanner;

public class Addition {
    public void numbers() {
        int firstNum;
        int secNum;
        Scanner s=new Scanner(System.in);

        System.out.print("Enter a first Number:- ");
        firstNum=s.nextInt();

        System.out.print("Enter a second number:- ");
        secNum=s.nextInt();

        System.out.println("Addition is " + (firstNum+secNum));
    }

    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.numbers();

    }
}

