package hafta5;

import java.util.Scanner;

public class kuvvethesaplama {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        
        System.out.println("Tabanı giriniz:");
        double taban = giris.nextDouble();

        System.out.println("Üssü giriniz:");
        double us = giris.nextDouble();

        double sonuc = 1 ;

        for (int a=1; a<= us; a++ )
        sonuc = sonuc*taban;

        System.out.println("sonuç = "+ sonuc);

    giris.close();


    }
}
