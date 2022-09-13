package hwfor7thweek;

public class SwitchCase {

    public static void  case1(String month) {
        switch (month){
            case "Jan":
                System.out.println("This is January");
                break;

            case "Feb":
                System.out.println("This is Febuary");
                break;

            case "Mar":
                System.out.println("This is March");
                break;

            case "April":
                System.out.println("This is April");
                break;

        }
    }
    public static void main(String[] args) {
        case1("Feb");
    }
}
