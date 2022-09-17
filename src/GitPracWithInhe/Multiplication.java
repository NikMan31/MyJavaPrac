package GitPracWithInhe;

public class Multiplication extends Substrcation {
    public int mul(int firstNum, int secNum){
        return firstNum*secNum;
    }

    public static void main(String[] args) {
        Multiplication M1=new Multiplication();
        M1.numbers();
        System.out.println("Multiplication is " + M1.mul(M1.firstNum, M1.secNum));

    }
}
