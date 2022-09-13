package hwfor7thweek;

public class CheckingVowels {
    public static void main(String[] args) {
        String Str="Nikunj";
        int count = 0;
        for(int i=0; i<Str.length(); i++){
            char strToCh=Str.charAt(i);
            if (strToCh=='a' || strToCh=='e' || strToCh=='i' || strToCh=='o' || strToCh=='u' || strToCh=='A' || strToCh=='E'||strToCh=='I'||strToCh=='O'|| strToCh=='U'){
                count++;
            }
        }
        System.out.println("Toatal vowels are "+ count);
    }

}
