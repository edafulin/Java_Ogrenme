//Parametre olarak yollanan bir sayının 
//asal sayı olup olmadığını geriye 
//döndüren bir metot yazınız. Eğer sayı 
//asal ise geriye “true” değil ise 
//“false” değeri döndürülecektir.

package hafta8;

import java.util.Scanner;

public class booleanmetodu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        System.out.println("sayıyı giriniz:");
        int sayi = giris.nextInt();
        System.out.println(asalsayimi(sayi));

        giris.close();

    }
    public static boolean asalsayimi( int sayi){
        int kalan = 0;
        int adet =0;
        boolean sonuc = true;
        for (int i = 1 ; i <= sayi; i++){
            kalan = sayi %i ;
            if(kalan==0)
                adet++;
        }
        if (adet>2)
            sonuc = false;

        return sonuc;
    }
}
