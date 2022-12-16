package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 kadar tamsayıları consola yazdırınız

        //1.yol for loop

        for (int i=3; i<7; i++){
            System.out.print(i+" ");
        }

        System.out.println();

        //2.yol while loop

       int i =3;
        while (i<7){

            System.out.print(i+" ");

            i++;
        }

        //Example 1: 23 den 12 kadar çift tamsayıları consola yazdırınız

        int k = 23;
        while (k>11 ){

            if(k%2==0) {
                System.out.print(k);
            }
            k--;
        }

        System.out.println();

        //Example 3: verilen bir tamsayının rakamları toplamını konsola yazdıran kodu yazınız ( sayı%10 her zaman sayının son rakamını verir)

        int num= -9623;

        num = Math.abs(num);

        int sum = 0;
        while (num>0){

            sum= sum +num%10;

            num/=10;
        }

        System.out.println(sum);



    }
}
