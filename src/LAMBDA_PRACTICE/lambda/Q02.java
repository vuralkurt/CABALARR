package LAMBDA_PRACTICE.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {

//        2) Bir class oluşturun, 'Q02' olarak adlandırın
//        3) 5 elemanlı bir tamsayı listesi oluşturun
//        4) Elemanlari doğal sıraya koyun
//        5)Konsoldaki son 3 elemanın karelerinin toplamını bulun.
//        6) Konsoldaki toplamı yazdırın
//        7) 'Fonksiyonel Programlama' kullanın

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>(Arrays.asList(2,13,30,5,10));
        a2(list);
    }
    public static void yazdir(int t) {
        System.out.println(t+" ");
    }

    public static void a2(List<Integer> list) {

        Integer a=list.stream().sorted().skip(2).map(t->t*t).reduce(0,(x,y)->x+y);

        System.out.println(a);
    }


}
