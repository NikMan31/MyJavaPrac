package hwfor7thweek;

public class ExForWhileLoop {
    public static void Table(int num){
        int start=1;
        while(start<=10){
            System.out.println(num + "*" +  start + "=" +  num*start);
            start++;
        }
    }

    public static void main(String[] args) {
        Table(5);
    }
}
