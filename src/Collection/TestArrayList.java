package Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println("Admin panel for editing pick up place");

        ArrayList<String> mylist=new ArrayList<>();

        System.out.println("Adding Place");

        Scanner s =new Scanner(System.in);

        int addPlaceNum=0;

        String addPlace;

            System.out.println("How many place you want to add:- ");
            addPlaceNum=s.nextInt();

            for(int i=0; i<addPlaceNum; i++) {
                System.out.println("Enter place name:- :- ");
                addPlace = s.next();
                mylist.add(addPlace);
            }
        System.out.println(mylist);

        System.out.println("For removing place");
        String placeName;
        System.out.println("Enter a place name for remove:- ");
        placeName=s.next();
        mylist.remove(placeName);

        System.out.println(mylist);




    }
}
