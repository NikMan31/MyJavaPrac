package ExceptionHandling;
import java.util.Scanner;

public class ExceptionHandling {
    int firstNum, secNum;
    Scanner s = new Scanner(System.in);
    ExceptionHandling(){
        System.out.println("Enter a first number:- ");
        firstNum=s.nextInt();

        System.out.println("Enter a second number:- ");
        secNum=s.nextInt();

    }
    static void Exceptionn() throws Exception{   // This is throws of Exception
        System.out.println("2nd Number is bigger than first number");
    }

    public void divison(){
        if (firstNum>secNum){
            System.out.println("Divison is " + firstNum/secNum);
        }
        else {
            try{
                int result=firstNum/secNum;
                Exceptionn();
            }
            catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        ExceptionHandling E1=new ExceptionHandling();
        E1.divison();
    }
}
