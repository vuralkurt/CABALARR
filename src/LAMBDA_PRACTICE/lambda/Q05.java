package LAMBDA_PRACTICE.lambda;

import java.util.Arrays;

public class Q05 {
        //         {"A", "B", "D", "C", "B", "A", "A", "B", "B"} gibi bir array oluşturun;
        //         Tekrarlanan öğeleri konsolda yazdırın

    public static void main(String[] args) {

        String aar[]={"A","B","C","B","A","A","B","B","D"};
        a1(aar);

    }

    public static void  a1(String[] aar){

       //  Arrays.stream(aar).filter(t->t.count()>=2).forEach(Q05::yaz);

    }

    public static void yaz(String t){
        System.out.println(t+" ");
    }

}
