package hafta5;
import  java.util.Scanner;

public class asciisayilar {

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
       /*  
        System.out.print("Bir harf giriniz:");
        char harf1 = giris.next().charAt(0);
        char harf2 = (char) (harf1 + 1);
        System.out.println(harf2);
      
        System.out.print("bir sayı giriniz:");
        int sayi1 = giris.nextInt();
        char harf = (char)(sayi1);
        System.out.println(harf);
        */

        System.out.print("bir harf giriniz:");
        char harf = giris.next().charAt(0);
        int sayi = harf;
        System.out.println(sayi);

        giris.close();

    }
}
