package HomeWork;

import java.util.*;

public class SmallBigEle {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<>();

        Scanner s=new Scanner(System.in);

        int num, size;

        System.out.print("How many elements you want to add:- ");
        size=s.nextInt();

        for(int i=0; i<size; i++){
            System.out.print("Enter a number:- ");
            num=s.nextInt();
            myList.add(num);
        }
        System.out.println(myList);
        Collections.sort(myList);

        System.out.println("Smallest elements from array is " + myList.get(0));

        Collections.sort(myList, Collections.reverseOrder());
        System.out.println("Largest elements from array is " + myList.get(0));
    }
}
