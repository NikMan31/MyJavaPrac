package Collection;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList =new LinkedList<>();
        Scanner s = new Scanner(System.in);

        String studName;
        int numOfStud;
        System.out.println("Enter how many students you want to add:- ");
        numOfStud=s.nextInt();
        for (int i=0; i<numOfStud; i++){
            System.out.println("Enter name of Student:- ");
            studName=s.next();
            myLinkedList.add(studName);
        }

        System.out.println("Linked List is" + myLinkedList);

        int studRemoveNum;
        System.out.println("How many student you want to remove:- ");
        studRemoveNum=s.nextInt();
        for (int i=1; i<=studRemoveNum; i++) {
            String nameStud;
            System.out.println("Enter a name of Student to whom you want to remove from above Linked List:- : ");
            nameStud = s.next();
            myLinkedList.remove(nameStud);
        }
        System.out.println("Now updated linked list is " + myLinkedList);


    }
}