package hwfor8thweek;
import java.util.Scanner;
public class NumToWord {
    public static void main(String[] args) {
        int num, lastNum = 0, i = 0;
        String str[]={"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        Scanner S=new Scanner(System.in);
        System.out.println("Enter a number:- ");
        num=S.nextInt();
        while(num>0)
        {
            lastNum=num%10;
            num=num/10;
            System.out.println(lastNum);
        }


    }
}









