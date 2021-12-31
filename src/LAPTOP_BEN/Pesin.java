package LAPTOP_BEN;


import java.util.Scanner;

public class Pesin {

    private static int indirimliFiyat;
    static Indirim indir = new Indirim();

    public static void pesinOdeme(int toplam) {


        System.out.println("Toplam tutar ==> " + toplam);
        indir.indirimOrani(toplam);                                  //==========================>>>>>>>>>>BIZI ALIR BU METHODA GÖ-TÜ-RÜRRR<<<<<<<<<<<<<<<================
        indirimliFiyat = toplam - (toplam * indir.indirim / 100);    //==========>>>>>>>>>>>ORADAKI ""IN-DI-RIM"" VARIABLESINE BIZI U-LAS-TI-RIR<<<<<<<<<<<<<<<<<============

        System.out.println("Odenecek Tutar = " + indirimliFiyat);

        for (int i = 1; i > 0; i++) {

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Lutfen yapacaginiz ÖDEME tutarini giriniz");

            int tutar = scan2.nextInt();

            if (tutar == indirimliFiyat) {
                System.out.println("Odemeniz yapildi");
                break;                                              //===============>>>>>>>>>>>>KIRILDI DONGU

            } else if (tutar > indirimliFiyat) {

                System.out.println("Para ustu = " + (tutar - indirimliFiyat));
                System.out.println("Odemeniz yapildi");
                break;

            } else if (tutar < indirimliFiyat) {
                System.out.println("Odemeniz yetersiz");
                indirimliFiyat = indirimliFiyat - tutar;
                System.out.println("Odemeniz gereken tutar ==> " + indirimliFiyat);
            }

        }


    }
}
