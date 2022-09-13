package hwfor4thweek;

public class Incrimental {
    public static int myMethod(int a){
        return a++;
    }


    public static void main(String[] args) {
        // There are 2 types of incrimental 1) Post Incrimental 2) Pre Incrimental
        int a=10;
        System.out.println(++a); //Here, 1st Incremental will be done
        System.out.println(a); // Here, it will print last updated value
        System.out.println(a++); // here, 1st print value of a and then Incremental will happen
        System.out.println(a);
        System.out.println(myMethod(5)); // Output will be 5, because assignment will work first
    }



}
