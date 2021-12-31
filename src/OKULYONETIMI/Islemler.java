package OKULYONETIMI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    /*
	BİR OKUL YÖNETİM PLATFORMU KODALYINIZ.
	1.	Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
		Kayıtlarda şu bilgiler olabilmelidir.
		Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
		Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.
	2.	Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
		Aşağıdaki gibi bir menü gösterilsin.
	====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	 1- ÖĞRENCİ İŞLEMLERİ
	 2- ÖĞRETMEN İŞLEMLERİ
	 Q- ÇIKIŞ
	3.	Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.
	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ
	SEÇİMİNİZ:
	4.	İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
	    ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
		Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.
 */

    static List<Kisi> ogrenciList = new ArrayList<>();
    static List<Kisi> ogretmenList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void anaMenu() {
        System.out.println("=========================\nOGRENCI VE OGRETMEN YONETIM PANELI\n"+"===================\n"
               +"1.OGRENCI ISLEMLERI\n2.OGRETMEN ISLEMLERI\nQ-Cikis");

        System.out.println("isleminizi seciniz");

        String secim=scan.next().toUpperCase();

        switch (secim){
            case "1":
                kisiTuru="OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru="OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                anaMenu();
                break;
        }



    }

    private static void cikis() {
        System.out.println("Cikis yaptiniz iyi gunler...");
    }

    private static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");
        System.out.println("Islem tercihini seciniz");
        int secimTercihi=scan.nextInt();

        switch (secimTercihi){
            case 0:
                anaMenu();
                break;
            case 1:
                ekleme();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                //islemMenusu();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                islemMenusu();
                break;

        }







    }

    private static void ekleme() {

        System.out.println("****"+kisiTuru+"ekleme sayfasi");
        System.out.println("Adinizi Soyadinizi giriniz");
        scan.nextLine();
        String adSoyad=scan.nextLine();
        System.out.println("Kimlik no giriniz");
        String kimlikNo= scan.next();
        System.out.println("Yas giriniz");
        int yas= scan.nextInt();

        if (kisiTuru.equals("OGRENCI")){
            System.out.println("Ogrenci no giriniz");
            String numara=scan.next();
            System.out.println("Sinifinizi giriniz");
            String sinif=scan.next();

            Ogrenci ogrenci=new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
            ogrenciList.add(ogrenci);
            System.out.println(ogrenci.toString()+"eklendi.");

        }else {
            System.out.println("Sicil no giriniz.");
            String sicilNo=scan.next();
            System.out.println("Bransini giriniz");
            String bolum=scan.next();

            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,sicilNo,bolum);
            ogretmenList.add(ogretmen);
            System.out.println(ogretmen.toString()+"eklendi");
        }
    }

    private static void arama() {

        System.out.println("*****   " + kisiTuru + " arama sayfasi   *****");
        boolean kontrol = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.print("aradiginiz ogrc kimlik No giriniz :");

            String araOgrcKimlk = scan.next();

            for (Kisi k : ogrenciList) {
                if (k.getKimlikNo().equals(araOgrcKimlk)) {
                    System.out.println("aradiginiz ogrenci : " + k.getAdSoyad());
                    kontrol = false;
                }
            }
            if (kontrol) {
                System.out.println("Aradığınız öğrenci mevcut değil");
            }
            anaMenu();
        } else {
            System.out.print("aradiginiz ogrt kimlik No giriniz :");
            String araOgrtKimlk = scan.nextLine();

            for (Kisi k : ogretmenList) {
                if (k.getKimlikNo().contains(araOgrtKimlk)) {
                    System.out.println("aradiginiz ogretmen : " + k.getAdSoyad());
                    kontrol = false;
                }
            }
            if (kontrol) {
                System.out.println("Aradığınız ogretmen mevcut değil");
            }
            anaMenu();
        }
    }

    private static void silme() {

        System.out.println("*****   " + kisiTuru + " silme sayfasi   *****");
        boolean kontrol = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {

            System.out.println("silinecek ogrc kimlik No giriniz :");
            scan.next();
            String silOgrcKimlk = scan.nextLine();
            for (Kisi k : ogrenciList) {
                if (k.getKimlikNo().contains(silOgrcKimlk)) {
                    System.out.println("sildiginiz  ogrenci : " + k.getAdSoyad());
                    ogrenciList.remove(k);
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                System.out.println("Aradığınız öğrenci mevcut değil");
            }
        } else {
            System.out.print("silinecek ogrt kimlik No giriniz :");
            scan.next();
            String silOgrtKimlk = scan.nextLine();
            for (Kisi k : ogretmenList) {
                if (k.getKimlikNo().contains(silOgrtKimlk)) {
                    System.out.println("sildiginiz ogretmen : " + k.getAdSoyad());
                    ogretmenList.remove(k);
                    kontrol = false;
                    break;
                }
            }
            if (kontrol) {
                System.out.println("Aradığınız ogretmen mevcut değil");
            }
        }
    }

    private static void listeleme() {
        System.out.println("****"+kisiTuru+"listeleme sayfasi");
        if (kisiTuru.equals("OGRENCI")){
            for (Kisi f: ogrenciList){
                System.out.println(f.toString());
            }
        }else {
            for (Kisi f:ogretmenList ) {
                System.out.println(f.toString());

            }
        }
    }
}
