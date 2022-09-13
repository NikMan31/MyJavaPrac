package hwfor7thweek;

public class SwitchCase3 {
    public static void ATMCase(int num){
        switch (num){
            case 1:
                System.out.println("Your withdrawal is successful");
                break;
            case 2:
                System.out.println("Your deposit is successful");
                break;
            case 3:
                System.out.println("You can see your balance");
                break;
            default:
                System.out.println("You have choose wrong number");

        }

    }

    public static void main(String[] args) {
        ATMCase(1);
    }
}
