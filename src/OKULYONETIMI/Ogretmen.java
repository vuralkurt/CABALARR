package OKULYONETIMI;

public class Ogretmen extends Kisi{

    private String sicilNo;
    private String bolum;

    public Ogretmen(String adSoyad, String kimlikNo, int yas, String sicilNo, String bolum) {
        super(adSoyad, kimlikNo, yas);
        this.sicilNo = sicilNo;
        this.bolum = bolum;
    }

    public Ogretmen(){

    }

    @Override
    public String toString() {
        return "Ogretmen{" +"ad soyad="+getAdSoyad()+",kimlik No :"+getKimlikNo()+", yas="+getYas()+
                ", sicilNo='" + sicilNo + '\'' +
                ", bolum='" + bolum + '\'' +
                '}';
    }
}
