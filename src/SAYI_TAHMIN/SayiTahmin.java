package SAYI_TAHMIN;


import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

   static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("HOSGELDINIZ");
        System.out.println("Tahmin icin sayi gir");


        Random ufur = new Random();

         int tahmin = scan.nextInt();

        int ufurr = ufur.nextInt(51);
        System.out.println(ufurr);

        while (tahmin != ufurr) {

            if (tahmin < 0 || tahmin > 50) {
                System.out.println("Sinirlarin disinda sayilar girildi");
                tahmin = scan.nextInt();

            }else if (tahmin>ufurr){
                System.out.println("Daha kucuk sayi gir");
                tahmin = scan.nextInt();
            }else {
                System.out.println("Daha buyuk sayi gir");
                tahmin = scan.nextInt();
            }
        }
        System.out.println("TEBRIKLERRRR......");

    }


}
