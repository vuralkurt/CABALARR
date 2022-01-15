package Mayin;

import java.util.Random;
import java.util.Scanner;



public class Mayin_Tarlasi {

    int satirSayisi, sutunSayisi, size;
    int harita[][];
    int board[][];
    boolean game = true;


    Random random = new Random();
    Scanner scan = new Scanner(System.in);


    public Mayin_Tarlasi(int satirSayisi, int sutunSayisi) {

        this.satirSayisi = satirSayisi;
        this.sutunSayisi = sutunSayisi;
        this.harita = new int[satirSayisi][sutunSayisi];
        this.board = new int[satirSayisi][sutunSayisi];
        this.size = satirSayisi * sutunSayisi;
    }

    public void run() {
        int row, col,success = 0;
        prepareGame();
        // baski(harita);
        System.out.println("Oyun basladi");

        while (game) {

            baski(harita);
            System.out.println("Satir");
            row = scan.nextInt();
            System.out.println("Sutun");
            col = scan.nextInt();

            if(row<0 || row>=satirSayisi){
                System.out.println("Gecersiz koordinat");
                continue;
            }
            if(col<0 || col>=sutunSayisi){
                System.out.println("Gecersiz koordinat");
                continue;
            }

            if (harita[row][col] != -1) {
                checkMayin(row, col);
                success++;
                if (success==(size-(size/4))){
                    System.out.println("Mayina basmadin");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over");
            }


        }

    }

    private void checkMayin(int r, int c) {
        if (harita[r][c] == 0) {

            if ( (c<sutunSayisi-1) && (harita[r][c + 1] == -1)) {
                harita[r][c ]++;
            }
            if ((c>0) && (harita[r][c - 1] == -1)) {
                harita[r][c ]++;
            }
            if ( r<satirSayisi-1 && (harita[r + 1][c] == -1)) {
                harita[r ][c]++;
            }
            if ((r>0) && (harita[r - 1][c] == -1)) {
                harita[r][c]++;
            }
            if(harita[r][c]==0){
                harita[r][c]=-2;
            }

        }
    }

    public void prepareGame() {

        int randSatir, randSutun, count = 0;

        while (count != (size / 4)) {

            randSatir = random.nextInt(satirSayisi);
            randSutun = random.nextInt(sutunSayisi);

            if (harita[randSatir][randSutun] != -1) {
                harita[randSatir][randSutun] = -1;
                count++;

            }

        }

    }

    public void baski(int aar[][]) {

        for (int i = 0; i < aar.length; i++) {

            for (int j = 0; j < aar[0].length; j++) {

                if (aar[i][j] >= 0)
                    System.out.print(" ");

                System.out.print(aar[i][j] + " ");

            }
            System.out.println();
        }

    }
}
