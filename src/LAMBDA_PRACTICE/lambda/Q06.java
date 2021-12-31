package LAMBDA_PRACTICE.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q06 {
    //Fonksiyonel Programlama ile [12, 9, 13, 4, 6, 2, 4, 12, 15] listesindeki tüm tek sayıları yazdırın
    //6 ile 14 arasindaki tum sayilarin karesini ekrana yazdiriniz
    //Listteki tek tamsayilarin karekoklerinin toplamini ekrana yazdiriniz

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(12,9,13,4,6,2,4,12,15));

        list.stream().filter(t->t>6 & t<14).map(t->t*t).forEach(Q06::yazdir);
        System.out.println();
       double a= list.stream().filter(t->t%2==1).map(Math::sqrt).reduce((double) 0,(x, y)->x+y);
        System.out.println(a);

    }
    public static void yazdir(int t){
        System.out.println(t+" ");
    }


}
