package hafta9;

import java.util.Scanner;

public class kelimesayisibulma {
    static Scanner giris = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bir cümle giriniz:");
        String cumle = giris.nextLine();
        System.out.println("kelime sayısı:" +  kelimeSayisiniBul(cumle));

    }
    public static int kelimeSayisiniBul (String gelencumle){
        int sayi =0;
        String kelimeler [] = gelencumle.split(" ");
        sayi = kelimeler.length;
        return sayi;
    }    
}
