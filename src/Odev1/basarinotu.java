package Odev1;
import java.util.Scanner;
public class basarinotu {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("1. kısa sınav notunuz girin:");
        double ksinav1 = giris.nextDouble();
        System.out.println("2. kısa sınav notunuz girin:");
        double ksinav2 = giris.nextDouble();
        System.out.println("3. kısa sınav notunuz girin:");
        double ksinav3 = giris.nextDouble();

        System.out.println("1. vize notunuzu girin:");
        double vize1 = giris.nextDouble();
        System.out.println("2. vize notunuzu girin:");
        double vize2 = giris.nextDouble();

        System.out.println("final notunuzu girin:");
        double finnal = giris.nextDouble();

        double ksinav = (ksinav1 + ksinav2 + ksinav3) / 3 ;
        double vize = (vize1 + vize2) / 2 ;
        double basarinotu = (ksinav * 50/100 + vize * 50/100 ) * 40/100 + finnal * 60/100 ;

        System.out.println("Başarı puanınız:" + basarinotu);

        giris.close();

    }
}
