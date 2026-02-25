package hafta3;
import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz.");
        double sayi1 = giris.nextDouble();

        System.out.println("2.sayıyı giriniz.");
        double sayi2 = giris.nextDouble();

        System.out.println("yapmak istediğiniz işlemi giriniz:");
        String islem = giris.next();

        double sonuc;

        if(islem.equals("+")){
            sonuc = sayi1+sayi2;
            System.out.println(sonuc) ;
        }

        else if(islem.equals("-")){
                sonuc = sayi1-sayi2;
            System.out.println(sonuc) ;
            }
        else if(islem.equals("*")){
                sonuc = sayi1*sayi2;
            System.out.println(sonuc) ;
            }
         else if(islem.equals("/")){
                sonuc = sayi1/sayi2;
            System.out.println(sonuc) ;
            }
        giris.close();



        



    }
    
}
