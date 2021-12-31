package LAPTOP_BEN;

public class Indirim {
    static int indirim;                                            // class level duzeyinde static bir variables olusturuldu.

    public static int indirimOrani(int toplam) {                 // [method adi:indirim orani  ] ::: [method parametresi:toplam fiyat -integer cinsinden]:::

        if (toplam > 2500) {
            indirim = 30;
        } else if (toplam > 2000) {
            indirim = 20;
        } else if (toplam > 1500) {
            indirim = 10;
        }
        return indirim;

    }
}
