package LAPTOP_BEN;




import java.util.Scanner;

public class KrediKarti {

    //class leveller tanimlandi
    static int indirimliFiyat;
    private static Data hesap = new Data();
    static String sifre;

    //method olusturuldu
    public static void kartOdeme(int toplam) {

        Indirim indir=new Indirim();               //object olusturuldu.Bizi indirim classina götürecek.

        System.out.println("Toplam tutar==>" + toplam);

        indir.indirimOrani(toplam);

        indirimliFiyat = toplam - (toplam * indir.indirim / 100);
        System.out.println("Ödenecek tutar:"+indirimliFiyat);

        for (int i = 0; i <100; i++) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Lutfen 8 haneli kredi karti numaranizi giriniz");
            String numara = scan.next();

            for (int j = 0; j < hesap.kartNo.size(); j++) {

                if (numara.equals(hesap.kartNo.get(j))) {

                    sifre=hesap.sifrem.get(j);


                }

            }


            System.out.println("Sifrenizi giriniz");
            String sifre1 = scan.next();

            if (sifre.equals(sifre1)) {
                System.out.println("Odeme tamamlandi");
                break;

            } else {
                System.out.println("Hatali giris yaptiniz");

            }


        }
    }
}
