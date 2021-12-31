package LAMBDA_PRACTICE.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q03 {
    //String isimlerden olusan bir list olusturun
    //Konsoldaki farklı öğeleri uzunluklarıyla birlikte yazdırın.
    //Konsoldaki farklı öğeleri yazdırın, uzunluklarına göre sıralayın.
    //Konsoldaki farklı öğeleri yazdırın, son karakterlerine göre sıralayın.
    //Konsoldaki farklı öğeleri ters sırada yazdırın.
    //Uzunluğu 7'den küçük olan farklı öğeleri ters sırada konsolda büyük harflerle yazdırın.

    public static void main(String[] args) {
        List<String>list = new ArrayList<String>(Arrays.asList("Elma","Portakal","Armut","Muz","Mandalina","Mango","Kayisi"));

        //a3(list);
        System.out.println("*****");
        System.out.println("*****");
       // a4(list);
        System.out.println("*****");
        System.out.println("*****");
       a5(list);
        System.out.println("*****");
        System.out.println("*****");
        a6(list);

    }
    public static void yazdir(String t) {
        System.out.println(t+"="+t.length());
    }

    public static void a3(List<String>list){

        list.stream().forEach(Q03::yazdir);

    }

    public static void a4(List<String>list){
        list.stream().sorted(Comparator.comparing(t->t.length())).forEach(Q03::yazdir);
    }

    public static void a5(List<String>list){
        list.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1))).forEach(Q03::yazdir);
    }

    public static void a6(List<String>list){

        list.stream().filter(t->t.length()<7).map(t->t.toUpperCase()).sorted(Comparator.reverseOrder()).forEach(Q03::yazdir);

    }
}
