package day11fotloop;

public class ForLoop01 {


    public static void main(String[] args) {

        //Example 1) verilen bir string de ilk 'a' harfinden önceki tüm kararkterleri konsola yazdırınız.
        //     "ı love java" ==> "ı love j"

        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'a') {
                break;
            }
            System.out.print(ch);//Tr
        }


        System.out.println("**************************");

        //Example 2) verilen bir string de son 'a' harfinden sonraki  tüm kararkterleri ters sırada  konsola yazdırınız.

        //     "germany"==> yn

        String s1 = "Germany";

        for (int i =s1.length()-1; i>=0; i--) {

            char ch = s1.charAt(i);

            if (ch=='a'){
                break;
            }
            System.out.print(ch);//yn
        }
    }//main
}//class