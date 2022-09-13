package function;

public class FunctionInfo {
    public static void fun(){ // This function is normal function means its not returning anything
        System.out.println("I am fresh function");
    }
    public void add(int a, int b){ // This function is not returning anything that's why function type is void
        int c=a+b;
        System.out.println("Addition is " + c);
    }
    public static int sub(int a, int b){ //This function is returning integer that's why function type is int
        return a-b;
    }

    public void statFun(){ // This function is without static function means only accessiable by object only.
        System.out.println("Hello, I am function without static means I am accessiable through object only");
    }

    public static String strFun(String name){ // This function is returning String so data type is String
        return name;
    }

    public static void main(String[] args) { // This is main function
        fun();
        System.out.println("Substraction is " + sub(4,5));
        System.out.println("Name is " + strFun("Nikunj"));
        FunctionInfo Obj = new FunctionInfo();
        Obj.statFun();
        Obj.add(5, 4);
    }

}

