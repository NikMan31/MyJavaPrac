package hwfor4thweek;

import function.FunctionInfo;

public class FunWithNotStat {
    public void add(int firstNum, int secNum){
        System.out.println("Addition of 2 given number is " + (firstNum+secNum));
    }

    public int multi(int firstNum, int secNum){
        return firstNum*secNum;
    }

    public float mod(int firstNum, float secNum){
        return firstNum%secNum;
    }

    public static void main(String[] args) {
        FunWithNotStat Obj1=new FunWithNotStat();
        Obj1.add(5, 4);
        System.out.println("Multiplication of 2 given number is " + Obj1.multi(5, 4 ));
        System.out.println(("Modules of 2 given number is " + Obj1.mod(5, 4)));

    }
}
