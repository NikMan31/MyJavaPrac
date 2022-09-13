package hwfor7thweek;

public class AddMulOfEle {
    public static void main(String[] args) {
        int sumForAdd = 0;
        int sumForMul=1;
        int Arr[]={1, 2, 3, 4, 5};
        for(int i=0; i<=Arr.length; i++){
            sumForAdd=sumForAdd+i;
        }
        System.out.println("Addition of elements is " + sumForAdd);
        for(int i=1; i<=Arr.length; i++){
            sumForMul=sumForMul*i;
         }System.out.println("Multiplication of elements is " + sumForMul);
   }
}

