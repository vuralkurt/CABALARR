package MayinTarlasi;

import java.util.Random;
import java.util.Scanner;

public class Mayin_Tarlasi {

    int satirSayisi,sutunSayisi,size;
    int harita [][];
    int board [][];

    Random random = new Random();
    Scanner scan = new Scanner(System.in);


    public Mayin_Tarlasi(int satirSayisi, int sutunSayisi) {

        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.harita=new int[satirSayisi][sutunSayisi];
        this.board=new int[satirSayisi][sutunSayisi];
        this.size=satirSayisi*sutunSayisi;
    }

    public void run() {
        prepareGame();
        baski(harita);

    }

    public void prepareGame() {

        int randSatir,randSutun,count =0;

        while (count !=(size/4)){

            randSatir=random.nextInt(satirSayisi);
            randSutun=random.nextInt(sutunSayisi);

            if (harita[randSatir][randSutun]!=-1){
                harita[randSatir][randSutun]=-1;
                count++;

            }

        }

    }

    public void baski(int aar[][]) {

        for (int i = 0; i <aar.length ; i++) {

            for (int j = 0; j <aar[0].length ; j++) {

                if (aar[i][j]>=0)
                    System.out.println(" ");

                System.out.print(aar[i][j]+" ");

            }
            System.out.println();
        }



    }


}
