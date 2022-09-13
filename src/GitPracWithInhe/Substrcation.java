package GitPracWithInhe;
import java.util.Scanner;
public class Substrcation extends Addition{
    public static void sub(int firstNum, int secNum){
        System.out.println("Substraction is " + (firstNum-secNum));
    }

    public static void main(String[] args) {
        int firstNum, secNum;

        Scanner s= new Scanner(System.in);

        System.out.print("Enter first Number:- ");
        firstNum=s.nextInt();

        System.out.print("Enter a second number:- ");
        secNum=s.nextInt();

        sub(firstNum, secNum);

        Substrcation objForSub=new Substrcation();
        System.out.println("This is addition through Inheritance");
        objForSub.numbers(); // Here, numbers is function property of Addition class ( Here, This number() is normal so using object you can do it)
                               // If this function is static then here you need to use classname.function like Addition.numbers()
    }
}
