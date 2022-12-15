package day11fotloop;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1) verilen bir stringde 'a' karakteri hariç tüm karakterleri yazdırınız.
        // "madagaskar"==> Mdgskr

        String a = "Madagaskar";

        //1.yol
       String t =  a.replace("a", "");
        System.out.println(t);

        //2.yol
        for (int i=0;i<a.length();i++ ){
            char ch = a.charAt(i);
            if (ch!='a'){
                System.out.print(ch);

            }

        }

        System.out.println("");


        //3.yol
        for (int i=0; i<a.length();i++){

            char ch = a.charAt(i);
            if (a.charAt(i)=='a'){
                continue;//bazı şartlar için loop un adımlarını atlamamızı sağlar continue==bosver
        }

            System.out.print(ch);


        }


    }
}
