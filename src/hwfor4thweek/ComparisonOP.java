package hwfor4thweek;

public class ComparisonOP {
    public void comparison1(int firstNum, int secNum){
        System.out.println(firstNum==secNum);
        System.out.println(firstNum!=secNum);
    }

    public void comparison2(int firstNum, int secNum){
        System.out.println(firstNum>secNum);
        System.out.println((firstNum<secNum));
    }

    public boolean comparison3(int firstNum, int secNum){
        return firstNum>=secNum;
    }

    public boolean comparison4(int firstNum, int secNum){
        return firstNum<=secNum;
    }

    public static void main(String[] args) {
        ComparisonOP obj1=new ComparisonOP();
        obj1.comparison1(10,20);
        obj1.comparison2(20,30);
        obj1.comparison3(30,40);
        obj1.comparison4(40, 50);
    }
}
