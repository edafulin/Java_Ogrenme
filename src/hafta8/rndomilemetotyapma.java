//rastgeleSayiUret(int baslangicDegeri, int bitisDegeri, int adet) 
//metodu başlangıç değeri ile bitiş değeri arasında istenilen adet 
// kadar rastgele sayı tutup ekrana yazdıracaktır. 
//Ör: rastgeleSayiUret(10,300,500); 
//metodu çalışır ise 10 ile 300 arasında rastgele 500 tane sayı 
// tutup ekrana yazdıracaktır

package hafta8;

import java.util.Random;
import java.util.Scanner;

public class rndomilemetotyapma {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.print("kaç tane sayı istiyorsunuz:");
        int adet = giris.nextInt();

        System.out.print("hangi sayıdan başlayalm:");
        int baslangic = giris.nextInt();

        System.out.print("hangi sayıya kadar olsun:");
        int bitis = giris.nextInt();

        rastgeleSayiUret(baslangic, bitis, adet);

        giris.close();

    }
    
    public static void rastgeleSayiUret (int baslangicDegeri , int bitiDegeri , int adet ){
        Random rnd = new Random();
        int sayi = 0;

        for (int i=0; i<adet ; i++){
            sayi = rnd.nextInt(baslangicDegeri,(bitiDegeri+1));
            System.out.println(sayi);
        }

    }
    
}
