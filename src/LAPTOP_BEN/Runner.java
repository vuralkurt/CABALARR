package LAPTOP_BEN;

import java.util.Scanner;

public class Runner {
    // CLASS LEVEL
    private static int secim;                                           //Her zaman kullanacigimiz icin secim objesi
    private static Hesaplama hesap = new Hesaplama();                   //Hesaplama classindan constractor  ===>bizi kredi hesaplama classina goturur.Oradaki methodlari kullanmamizi saglar
    private static KrediKarti kart=new KrediKarti();                    // Kredi karti classindan constractor ===>bizi kredi karti classina goturur.Oradaki methodlari kullanmamizi saglar
    private static Pesin cash=new Pesin();                              // Pesin clasinndan constractor  ===> bizi pesin odeme classina goturur.Oradaki methodlari kullanmamizi saglar


    //MAIN BURADA
    public static void main(String[] args) {
        System.out.println("\t\t\tMAGAZAMIZA HOSGELDINIZ\n\tUrunlerimizi inceleyebilir ve satin alabilirsiniz");
        islemMenusu();

    }

    private static void islemMenusu() {
        System.out.println("Lutfen yapmak istediginiz islemi seciniz");
        System.out.println("1-Urunleri gor ve satin al\n2-Cikis");

        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                urunGorme();
                satinAlma();
                break;
            case 2:
                cikis();
                break;
            default:
                System.out.println("Hatali deger girdiniz");
                islemMenusu();
                break;
        }

    }

    private static void urunGorme() {

        Scanner scan = new Scanner(System.in);

        //1.KISIM
        System.out.println("Sectiginiz markanin numarasini giriniz");
        for (int i = 0; i < hesap.marka.size(); i++) {
            System.out.println(i + 1 + "-" + hesap.marka.get(i) + "  Fiyati:" + hesap.markaPrice.get(i));
        }

        secim = scan.nextInt() - 1;
        hesap.setToplamFiyat(hesap.markaPrice.get(secim));
        System.out.println(hesap.getToplamFiyat());

        //2.KISIM
        System.out.println("Sectiginiz islemci giriniz");
        for (int i = 0; i < hesap.islemci.size(); i++) {
            System.out.println(i + 1 + "-" + hesap.islemci.get(i) + "Fiyati:" + hesap.islemciPrice.get(i));

        }
        secim = scan.nextInt() - 1;
        hesap.setToplamFiyat(hesap.getToplamFiyat() + hesap.islemciPrice.get(secim));
        System.out.println("Toplam fiyat:" + hesap.getToplamFiyat());

        //3.KISIM
        System.out.println("Sectiginiz ram giriniz");
        for (int i = 0; i < hesap.ram.size(); i++) {
            System.out.println(i + 1 + "-" + hesap.ram.get(i) + "Fiyati:" + hesap.ramPrice.get(i));

        }
        secim = scan.nextInt() - 1;
        hesap.setToplamFiyat(hesap.getToplamFiyat() + hesap.ramPrice.get(secim));
        System.out.println("Toplam fiyat:" + hesap.getToplamFiyat());

        //4.KISIM
        System.out.println("Sectiginiz rengi giriniz");
        for (int i = 0; i < hesap.color.size(); i++) {
            System.out.println(i + 1 + "-" + hesap.color.get(i) + "Fiyati:" + hesap.colorPrice.get(i));

        }
        secim = scan.nextInt() - 1;
        hesap.setToplamFiyat(hesap.getToplamFiyat() + hesap.colorPrice.get(secim));
        System.out.println("Toplam fiyat:" + hesap.getToplamFiyat());

        //5.KISIM
        System.out.println("Sectiginiz size giriniz");
        for (int i = 0; i < hesap.size.size(); i++) {
            System.out.println(i + 1 + "-" + hesap.size.get(i) + "Fiyati:" + hesap.sizePrice.get(i));

        }
        secim = scan.nextInt() - 1;
        hesap.setToplamFiyat(hesap.getToplamFiyat() + hesap.sizePrice.get(secim));
        System.out.println("Toplam fiyat:" + hesap.getToplamFiyat());


    }

    private static void satinAlma() {
        System.out.println("Satin almaya hosgeldiniz");
        System.out.println("ISLEMLER\n1-SATIN AL\n2-VAZGEC ve URUN SECME MENUSUNE DÖN\n3-CIKIS");

        Scanner scan = new Scanner(System.in);
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                odeme();
                break;
            case 2:
                islemMenusu();
                break;
            case 3:
                cikis();
                break;
            default:
                System.out.println("Hatali deger giridniz");
                satinAlma();
                break;

        }

    }

    private static void odeme() {
        System.out.println("Odeme sayfasina hosgeldiniz\n1-Pesin Odeme\n2-Kredi Karti ile odeme\n3-Islem menusune donus");
        Scanner scan = new Scanner(System.in);
        secim = scan.nextInt();

        switch (secim) {
            case 1 -> Pesin.pesinOdeme(hesap.getToplamFiyat());
            case 2 -> KrediKarti.kartOdeme(hesap.getToplamFiyat());
            case 3 -> islemMenusu();
            default -> {
                System.out.println("Hatali deger");
                odeme();
            }
        }

    }



    private static void cikis() {
        System.out.println("\t BIZI TERCIH ETTIGINIZ ICIN TESEKKUR EDERIZ\n\t\t\t\tYINE BEKLERIZ");
    }
}
