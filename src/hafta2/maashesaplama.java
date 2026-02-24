package hafta2;

import java.util.Scanner;

public class maashesaplama {
    public static void main(String[] args) {
        /*Bir çalışanın brüt maaşı çalıştığı saate göre 
hesaplanmaktadır. Çalıştığı her saat için 100TL ücret 
almaktadır.  Brüt maaşın %15'i sigorta primi için ve 
brüt maaşın %10'u devlete vergi olarak ayrılmaktadır.
Çalışılan saate göre maaş bilgilerini yazdırınız.*/

        Scanner giris = new Scanner(System.in);

        System.out.print("kaç saat çalıştınız?:");
        float saat = giris.nextFloat();

        float maas = 100*saat ;

        float sprim = maas*15/100 ;

        float vergi = maas*10/100 ;

        float netmaas = maas - sprim - vergi ;

        System.out.println("sigortaya giden prim : " + sprim);
        System.out.println("devlete kesilen vergi: " + vergi);
        System.out.println("net maasınız: " + netmaas);

        giris.close();

    }
}
