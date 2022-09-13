package hwfor7thweek;

public class EleByPos {
    public static void main(String[] args) {
        int Arr[] = {1, 2, 3, 4, 5};
        int pos=2;
        for(int i=0; i<=Arr.length; i++){
            if (i==pos){
                System.out.println("Element of given position is " + Arr[i]);

            }

        }

    }
}
