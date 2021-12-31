package MANAV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Manav {

    static List<String>urunlistesi=new ArrayList<>(Arrays.asList("00 Domates", "01 Patates", "02 Biber", "03 Sogan",
            "04 Havuç", "05 Elma  ", "06 Muz  ", "07 Çilek", "08 Kavun", "09 Üzüm  ", "10 Limon"));
    static List<Double>urunfiyatlistesi=new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static Scanner scan=new Scanner(System.in);
    //static List<String>alinanUrunListesi=new ArrayList<>();
    static List<String>sepettekilerUrun=new ArrayList<>();
    static List<Double>sepettekilerUrunKilo=new ArrayList<>();
    static List<Double>sepettekilerFiyat=new ArrayList<>();

    public static void main(String[] args) {


        /*
         * Basarili Market alış-veriş programı.
         *
         * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz. No Ürün Fiyat
         * ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02 Biber 1.50 TL
         * 03 Soğan 2.30 TL 04 Havuç 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 Çilek
         * 6.10 TL 08 Kavun 4.30 TL 09 Üzüm 2.70 TL 10 Limon 0.50 TL ​ 2. Adım:
         * Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz. 3. Adım: Kaç
         * kg satın almak istediğini sorunuz. 4. Adım: Alınacak bu ürünü sepete
         * ekleyiniz ve Sepeti yazdırınız. 5. Başka bir ürün alıp almak istemediğini
         * sorunuz. 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına
         * yönlendiriniz. 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu
         * hesaplayarak programı bitirinzi.
         */

        int tercih=0;
        double toplamfiyat=0;
        System.out.println("~~~~~~~~~HOSGELDINIZ~~~~~~~~~~~~");
        do {
            urunlerr();

            System.out.println("Lütfen almak istediginiz urun no giriniz");
            int urunNo=scan.nextInt();

            System.out.println("Urunden kac kilo almak istiyorsunuz?");
            double urunKilo=scan.nextDouble();

            sepetUrunleri(urunNo,urunKilo);

            toplamfiyat=  sepettutari();

            System.out.println("Baska bir urun almak istiyor musunuz.devam etmek icin 1 basiniz?");

            tercih= scan.nextInt();



        }while (tercih==1);
        odeme(toplamfiyat);
    }

    private static void odeme(double toplamfiyat) {
        System.out.println("Odemeniz gereken tutar:"+toplamfiyat);
        double nakit = 0;
        do {
            System.out.print("lutfern nakit odemenizi girirniz : ");

            nakit += scan.nextDouble();
            if (nakit < toplamfiyat) {
                System.out.println("eksik odeme yaptiniz " + (toplamfiyat - nakit) + " daha odeme yapiniz");
            }
        } while (nakit < toplamfiyat);
        double paraUstu = nakit - toplamfiyat;
        if (paraUstu > 0) {
            System.out.println("para ustunuz : " + paraUstu);
        }

        System.out.println("yine bekleriz iii gunler");

    }



    private static double sepettutari() {
        double sepettutar=0;
        double sepetkg=0;

        for (int i = 0; i <sepettekilerUrun.size() ; i++) {

            sepetkg+=sepettekilerUrunKilo.get(i);
            sepettutar+=sepettekilerFiyat.get(i);

            System.out.println("Odemeniz gereken toplam tutar:"+" "+sepettutar+" "+" "+"sepetteki urunler toplami"+"   "+sepetkg);


        }


        return sepettutar;
    }


    private static void urunlerr() {
        System.out.println();
        System.out.println("No\tUrunler\tFiyatlar");
        System.out.println("======\t======\t=======");

        for (int i = 0; i <urunlistesi.size() ; i++) {
            System.out.println(""+i+"\t"+urunlistesi.get(i)+"\t"+urunfiyatlistesi.get(i));
        }

        }

    private static void sepetUrunleri(int urunNo, double urunKilo) {
        sepettekilerUrun.add(urunlistesi.get(urunNo));

        sepettekilerUrunKilo.add(urunKilo);
        System.out.println(sepettekilerUrun+"="+sepettekilerUrunKilo+"kg");
        sepettekilerFiyat.add(urunfiyatlistesi.get(urunNo)*urunKilo);
    }



  
}
