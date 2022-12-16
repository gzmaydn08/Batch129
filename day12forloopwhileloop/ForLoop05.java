package day12forloopwhileloop;

public class ForLoop05 {
    public static void main(String[] args) {

        //Example 1) hiç sayı kullanmadan 1 den 100 e kadar olan sayıları kosola yazdırınız.

        for (int i = 'd'/'d'; i<='d'; i++){
            System.out.print(i + " ");

        }


        //note: bazı looplar hiç çalışmayabilir.

//        for (int i= 1; i<0 ; i--){
//            System.out.println("hi");//zero execution
//
//        }

        //note: bazı looplar sonsuz defa çalışabilir.
        //bu tarz looplara infinite loop denir
        //infinite loop genelde "incremet,decrement" kısmında yapılna hatadan kaynaklanır

        //   for(int i= 1; i<10; i--){
        //      System.out.println("java is money....");
        //}


        //note: başka bir infinite loop
        for (int i =1;   ;  ){
            System.out.println("hi");

        }




    }
}
