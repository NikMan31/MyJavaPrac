// Here, numbers is function property of Addition class ( Here, This number() is normal so using object you can do it)
// If this function is static then here you need to use classname.function like Addition.numbers()
package GitPracWithInhe;
import java.util.Scanner;
public class Substrcation extends Addition{
    public static void sub(int firstNum, int secNum){
        int result;
        result=firstNum-secNum;
        System.out.println("Substraction is :- " + result);
    }

    public static void main(String[] args) {
        Substrcation s1=new Substrcation();
        s1.numbers();
        sub(s1.firstNum, s1.secNum);


    }
}
