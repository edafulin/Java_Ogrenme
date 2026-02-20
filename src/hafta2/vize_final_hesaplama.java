package hafta2;

import java.util.Scanner;

public class vize_final_hesaplama {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        System.out.print("vize notunu girin:");
        float vize = giris.nextInt();

        System.out.print("final notunu girin:");
        float finnal = giris.nextInt();

        float sonuc = vize*0.4f + finnal*0.6f ;

        System.out.println(sonuc);

        giris.close();
    }
}
