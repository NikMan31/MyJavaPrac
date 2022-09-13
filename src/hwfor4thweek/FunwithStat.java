package hwfor4thweek;

public class FunwithStat {
    public static void norFun(){
        System.out.println("Hello, I am normal function");
    }

    public static String statFun(){
        return "Hello, I am function with returning String";
    }

    public static int add(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        norFun();
        System.out.println(statFun());
        System.out.println("Addition is " + add(5, 4));
    }
}
