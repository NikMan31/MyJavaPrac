package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap=new HashMap<>();

        Scanner s=new Scanner(System.in);

        int ID, num;
        String name;

        System.out.println("How many student you want to add:- ");
        num=s.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Enter a ID:- ");
            ID=s.nextInt();

            System.out.println("Enter a name of Student:- ");
            name=s.next();

            myHashMap.put(ID, name);
        }
        System.out.println("HashMap is " + myHashMap);

        Set<Integer> keys=myHashMap.keySet();
        System.out.println("Keys are " + keys);


    }
}
