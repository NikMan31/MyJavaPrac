package hwfor8thweek;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class findingSqrt {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number for finding square root:- ");
        int num=obj.nextInt();

        System.out.println("Squre root of given number is :- " + Math.sqrt(num));

    }


}
