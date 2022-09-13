package hwfor8thweek;
import java.util.Random;

public class randomClassEx {
    public static void main(String[] args) {
        Random obj1=new Random(); // Here, Create object for random class so can use all properties of random class
        int randNum=obj1.nextInt(); // Here, I am using nextInt function from Random class
        System.out.println(randNum);
    }
}
