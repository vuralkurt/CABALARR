package LAMBDA_PRACTICE.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q07 {
    //String isimlerden olusan bir list olusturnuz
    //List'deki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
    //List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin

    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(Arrays.asList("Hande","Nesrin","Hacer","Emine","Cagla","Oguz","Elif"));

        //a1(list);
        System.out.println("=====");
        a2(list);

    }

    public static void yazdir(String t) {
        System.out.println(t);
    }

    public static void a1(List<String> list){

        list.stream().filter(t->t.contains("a") || t.contains("n") ||t.contains("N") ||t.contains("A")).forEach(Q07::yazdir);


    }

    public static void a2(List<String> list){

        list.
                stream().
                map(t->t.toLowerCase()).
                filter(t->t.toString().charAt(0)<t.toString().charAt(t.length()-1)).
                forEach(Q07::yazdir);

    }


}
