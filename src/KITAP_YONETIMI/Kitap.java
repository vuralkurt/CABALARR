package KITAP_YONETIMI;

public class Kitap {
    private int kitapNo;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinyili;
    private double fiyat;

    public Kitap(){

    }

    public Kitap(int kitapNo, String kitapAdi, String yazarAdi, int yayinyili, double fiyat) {
        this.kitapNo = kitapNo;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinyili = yayinyili;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "" +
                "kitapNo=" + kitapNo +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", yayinyili=" + yayinyili +
                ", fiyat=" + fiyat ;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public int getKitapNo() {
        return kitapNo;
    }

    public void setKitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
