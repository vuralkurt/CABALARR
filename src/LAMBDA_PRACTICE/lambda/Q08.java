package LAMBDA_PRACTICE.lambda;

import java.util.stream.IntStream;

public class Q08 {
    // 7 ile bolunebilen ilk 10 tamsayinin toplamini ekrana yazdiriniz.
    public static void main(String[] args) {

        System.out.println(a1(10));

    }

    public static int a1(int x){

      return   IntStream.iterate(7,t->t+7).limit(x).sum();

    }

}
