package GitPracWithInhe;

public class Multiplication extends Substrcation {
    public void mul(){
        int num1=10;
        int num2=12;

        int result=num1*num2;
        System.out.println("Multiplication is " + result);
    }

    public static void main(String[] args) {
        System.out.println("-------- From Multiplication class---------");
        Multiplication M1=new Multiplication();
        M1.mul(); // This is from Multiplication Class
        System.out.println("--------- From Substraction class ----------");
        Substrcation.sub(5,6); // This is from Substraction class
        System.out.println("--------- From Addition class ---------------");
        M1.numbers(); // This is from Addition class
    }
}
