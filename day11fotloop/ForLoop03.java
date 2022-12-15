package day11fotloop;

public class ForLoop03 {
    public static void main(String[] args) {

   //example 1: size verilen bir stringi tersten yazdırınız. germany==> ynamreg // önemli!!!!!!!!!!!

        String s= "Germany";

        String t = "";


        for (int i = s.length()-1; i>=0; i--){
           t = t + s.charAt(i);

        }

        System.out.println(t);//FORUN İÇİNDE HER ADIMI BİRER BİRER YAZDIRIR


        // size verilen bir stringin palindrome olup olmadığını kontrol eden kodu yazınız.
        // civic nalan kucuk 11211==>palindrome

        //stringi ters çevir sonrada düz hali ile ters halini karşılaştır aynı ise palidrom de
        String duz = "Civic";
        String ters = "";

        for (int i = duz.length()-1; i>=0; i--){
            ters= ters+duz.charAt(i);
        }

        if (duz.equalsIgnoreCase(ters)){
            System.out.println(duz +" : palindrome'dur");

        }else {
            System.out.println(duz +" : palindrome değildir.");
        }
    }
}
