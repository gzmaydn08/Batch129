package day11fotloop;

public class ForLoop04 {
    public static void main(String[] args) {

        //Example 1: 5 den 8 e kadar tam sayıların toplamını veren kodu yazınız ÖNEMLİ!!!!!!!
        //    5+6+7+8+==>26

        int sum =0;

        for (int i=5; i<9 ; i++){
            sum = sum + i;


        }
        System.out.println(sum);

        
        
        
        
        //Example 2: 7 den 9 a kadar tam sayıların çarpımını  veren kodu yazınız ÖNEMLİ!!!!!!!

        int sum1 = 1;

        for (int i = 7; i<10; i++){

            sum1 = sum1 * i;

        }

        System.out.println("sonuç: "+ sum1);
    }
}
