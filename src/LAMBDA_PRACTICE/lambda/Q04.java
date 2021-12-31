package LAMBDA_PRACTICE.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q04 {

    //    3) "Ali", "John", "Ali", "Alexander", "Taylor", "Ali", "Jackson" öğelerini içeren bir Dize listesi oluşturun
//        4) "J" ile baslayin olan öğeleri almayın
//        5) Farklı öğeleri seçin
//        6)Karakter sayısına göre doğal sıraya koyun
//        7) Tüm öğeleri büyük harfe dönüştürün
//        8) Konsoldaki öğeleri yazdırın
//        9)Fonksiyonel Programlama'yı kullanın

    public static void main(String[] args) {

        List<String> list=new ArrayList<String>(Arrays.asList("Ali","John","Alexander","Taylor","Ali","Jackson"));

        a7(list);
        System.out.println("====");
        a8(list);
        System.out.println("####");
        a9(list);

    }

    public static void yazdir(String t) {
        System.out.println(t+"="+t.length());
    }

    public static void a7(List<String>list) {
        list.stream().sorted(Comparator.comparing(t->t.length())).forEach(Q04::yazdir);

    }

    public static void a8(List<String>list) {

        list.stream().filter(t->!t.startsWith("J")).sorted().forEach(Q04::yazdir);

    }

    public static void a9(List<String> list){

        list.stream().map(t->t.toUpperCase()).forEach(Q04::yazdir);

    }


}
