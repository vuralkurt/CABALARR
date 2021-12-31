package HASTANE_YONETIMI;

public class HastaneRunner {

    private static Hastane hastane1=new Hastane();
    static String hastaDurumu="Allerji";


    public static void main(String[] args) {

        //String hastaDurumu="Alerji";

        String unvan=doktorUnvan(hastaDurumu);

        hastane1.setDoktor(doktorBul(unvan));
        hastane1.setHasta(hastaBul(hastaDurumu));

        System.out.println(doktorBul(unvan).toString());
        System.out.println(hastaBul(hastaDurumu));



    }

    private static String doktorUnvan(String aktuelDurum) {
        if (aktuelDurum.equals("Allerji"))
        return "Allergist";

        if (aktuelDurum.equals("Bas agrisi"))
            return "Norolog";

        if (aktuelDurum.equals("Diabet"))
            return "Genel cerrah";

        if (aktuelDurum.equals("Soguk alginligi"))
            return "Cocuk doktoru";

        if (aktuelDurum.equals("Migren"))
            return "Dahiliye";
        if (aktuelDurum.equals("Kalp hastaliklari"))
            return "Kardiolog";
        else
            return "yanlis unvan";
    }

    public static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();

        for (int i = 0; i < VeriBankasi.unvanlar.length; i++) {
            if (unvan.equals(VeriBankasi.unvanlar[i])) {
                doktor.setIsim(VeriBankasi.doctorIsimleri[i]);
                doktor.setSoyisim(VeriBankasi.doctorSoyIsimleri[i]);
                doktor.setUnvan(VeriBankasi.unvanlar[i]);
            }

        }

        return doktor;
    }

    public static Durum hastaDurumuBul(String aktuelDurum) {
        Durum hastaDurumu = new Durum();
        hastaDurumu.setAktuelDurum(aktuelDurum);

        switch(aktuelDurum) {
            case "Allerji":
                hastaDurumu.setAciliyet(false);
                break;
            case "Bas agrisi":
                hastaDurumu.setAciliyet(false);
                break;
            case "Diabet":
                hastaDurumu.setAciliyet(false);
                break;
            case "Soguk alginligi":
                hastaDurumu.setAciliyet(false);
                break;
            case "Migren":
                hastaDurumu.setAciliyet(true);
                break;
            case "Kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
                break;
        }
        return hastaDurumu;
    }

    public static Hasta hastaBul(String actualCase) {

        Hasta hasta = new Hasta();

        for (int i = 0; i < VeriBankasi.durumlar.length; i++) {

            if (hastaDurumu.equals(VeriBankasi.durumlar[i])) {
                hasta.setHastaDurumu(hastaDurumuBul(VeriBankasi.durumlar[i]));
                hasta.setIsim(VeriBankasi.hastaIsimleri[i]);
                hasta.setSoyisim(VeriBankasi.hastaSoyIsimleri[i]);
                hasta.setHastaID(VeriBankasi.hastaIDleri[i]);

            }

        }


        return hasta;
    }
}
