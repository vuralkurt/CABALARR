package KITAP_YONETIMI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KitapMethod {

    /*
	1.	Kullanıcının Kitap ekleme, silme ve listeleme gibi
		işlemleri yapmasına imkan tanıyan bir uygulama yazınız.

	2.	Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara vermeli.
		Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
		Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

		========= KİTAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: Tüm kitapları listele
			4: Bitir
	*/

    static Scanner scan=new Scanner(System.in);
    static List<Kitap>kitapList=new ArrayList<Kitap>();
    static int kitapNo=1000;
    static List<Double>fiyatsepet=new ArrayList<>();



    static void anaMenu() {

        System.out.println("=======KITAP PROGRAMI=======\n 1.Kitap Ekle \n 2.Numara ile kitap sil" +
                "\n 3.Tum kitaplari listele \n 4.Odeme\n 5.Cikis ");

        System.out.println("lutfen seciminizi giriniz");
        int secim=scan.nextInt();

        switch (secim){
            case 1:
                kitapEkle();
                break;
            case 2:
                kitapSil();
                break;
            case 3:
                kitapListele();
                break;
            case 5:
                cikis();
                break;
            case 4:
                odeme();
                break;
            default:
                System.out.println("Yanlis bir secim yaptiniz.Kontrol ediniz");
        }




    }

    private static void odeme() {
        double toplam=0;
        double sepettutari = 0;

          String tercih;
            System.out.println("Almak istediginiz kitabin no gir.");
            int alinacakKitapNo=scan.nextInt();
            boolean kontroll=true;
            for (Kitap k:kitapList) {

                if (alinacakKitapNo ==k.getKitapNo()) {
                    sepettutari=k.getFiyat();
                    fiyatsepet.add(sepettutari);

                    for (Double t:fiyatsepet) {
                        toplam+=t;

                    }
                    System.out.println(toplam);
                    kontroll=false;
                    break;
                }

            }
            if(kontroll)
                System.out.println("Bu kitap yok");


          System.out.println("Devam etmek istiyor musunuz evet icin E basiniz");
            tercih=scan.next();
           if(tercih.equalsIgnoreCase("E")){
               odeme();

           }else
               System.out.println("Ne kadar odeyeceksiniz");
               double odemetutar=scan.nextDouble();

               if(toplam>odemetutar){
                   System.out.println("yetersiz bakiye" );

               }
               else {
                   double paraustu=odemetutar-sepettutari;
                   System.out.println(paraustu);
               }

            cikis();
    }

    private static void cikis() {
        System.out.println("Gene bekleriz.....");
    }

    private static void kitapListele() {

        for (Kitap k:kitapList) {
            System.out.println(k);

        }
        anaMenu();
    }

    private static void kitapSil() {
        System.out.println("Silinecek kitabin no gir");
        int silKitap=scan.nextInt();
        boolean kontrol=true;
        for (Kitap k:kitapList) {

            if (silKitap == k.getKitapNo()) {

                kitapList.remove(k);
                System.out.println(k.getKitapAdi()+"  isimli kitap SILINDI");
                kontrol=false;
                break;
            }

        }
        if(kontrol){
            System.out.println("Yok bu kitap");
        }

        anaMenu();
    }

    private static void kitapEkle() {
        System.out.println("Kitap adini gir");
        scan.nextLine();
        String kitapAdi=scan.nextLine();
        System.out.println("Yazar adi gir");
        String yazarAdi=scan.nextLine();
        System.out.println("Yayin yilini gir");
        int yayinyili=scan.nextInt();
        System.out.println("Fiyatini gir");
        double fiyat=scan.nextDouble();

        Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinyili,fiyat);
        kitapList.add(kitap);

        anaMenu();


    }


}
