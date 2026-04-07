package hafta6;

import java.util.Random;

public class rastgelesayi {
    public static void main(String[] args) {
        Random rastgele = new Random();

        int a = 50;
        int c = 0;
        int b = 0;

        // 0...100 arasında rastgele bir sayı tutar ve c ye atar.
        c = rastgele.nextInt(100);
        System.out.println(c);

        // 0...150 arasında rastgele bir sayı tutar ve c ye atar.
        b = a + rastgele.nextInt(100);
        System.out.println(b);


        // en çok ve en az cerilecek sayı arasında rastgele sayı seçtirme
        int baslangic = 5;
        int bitis = 8;
        int rastgelesayi = 0;

        rastgelesayi = baslangic + ((int) (Math.random()*(bitis - baslangic + 1)));
        System.out.println(rastgelesayi);


    }
    
}
