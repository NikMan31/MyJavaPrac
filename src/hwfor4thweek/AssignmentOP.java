package hwfor4thweek;

public class AssignmentOP {
    public static void  assignment(int num){
        System.out.println("value of num is " + num);
        System.out.println("Value of num with += is " + (num+=5));
    }

    public static void assignment2(int num){
        System.out.println("Value of num with -= is "+ (num-=5));
        System.out.println("Value of num with *= is "+(num*=5));
    }

    public static int assignment3(int num){
        return num%=5;
    }

    public static int assignment4(int num){
        return num/=5;
    }

    public static void main(String[] args) {
        assignment(5);
        assignment2(10);
        System.out.println("Value of num with /= is " + (assignment4(15)));
        System.out.println("Value of num with %= is "+ (assignment3(15)));

    }
}
