package Odev1;
import java.util.Scanner;

public class idealkilohesaplama {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("boyunuzu cm cinsinden giriniz:");
        int boy = giris.nextInt();

        System.out.println("yaşınızı giriniz:");
        int yas = giris.nextInt();

        System.out.println("cinsiyetinizi giriniz kadınsa k erkekse e yazınız.");
        char cinsiyet = giris.next().charAt(0);

        System.out.println("kilonuzu giriniz:");
        double kilo = giris.nextDouble();

        if ( cinsiyet == 'k'){
        final double k = 0.8;
        double idealk = (boy - 100 + yas/10 )*k;
        System.out.println("ideal kilonuz : " + idealk);
            if(kilo > idealk){
                System.out.println(kilo - idealk + " kg vermelisiniz.");
            }else if (idealk < kilo){
                System.out.println(idealk - kilo + "kg vermelisiniz.");
            }else if (idealk == kilo){
                System.out.println("Tebrikler! ideal kilodasınız.");
            }
        }

        else if (cinsiyet == 'e'){
            final double k = 0.9 ;
            double idealk = (boy - 100 + yas / 10 )*k; 
            System.out.println("ideal kilonuz : " + idealk);
            if ( kilo > idealk ){
                System.out.println(kilo - idealk + "kg vermelisiniz.");
            }else if (idealk > kilo){
                System.out.println(idealk - kilo + "kg vermelisiniz");
            }else if (idealk == kilo){
                System.out.println("Tebrikler! ideal kilodasınız.");
            }

        }


        giris.close();

    }
    
}
