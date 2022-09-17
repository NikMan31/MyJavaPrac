package GitPracWithInhe;
import java.util.Scanner;

public class Addition {
        int firstNum;
        int secNum;
        Scanner s=new Scanner(System.in);

        public void numbers(){
            System.out.println("Enter a first Number:- ");
            firstNum=s.nextInt();

            System.out.println("Enter a second Number:- ");
            secNum=s.nextInt();
        }
        public void add(){
            int result;
            result=firstNum+secNum;
            System.out.println("Addition of given number is :- " + result);
        }
    public static void main(String[] args) {
        Addition obj=new Addition();
        obj.numbers();
        obj.add();

    }
}

