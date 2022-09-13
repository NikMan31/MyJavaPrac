package hwfor7thweek;

public class SwitchCase2 {
    public static void case1(String day){
        switch (day){
            case "Mon":
                System.out.println("This is Monday");
                break;
            case "Tue":
                System.out.println("This is Tuesday");
                break;

            case "Wed":
                System.out.println("This is Wednesday");
                break;
            case "Thu":
                System.out.println("This is Thursday");
                break;
            default:
                System.out.println("You entered incorrect");

        }
    }

    public static void main(String[] args) {
        case1("Mon");
    }
}
