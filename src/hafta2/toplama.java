package hafta2;
import java.util.Scanner;
/*scanner ı kullanabilmek için yani klavyeden veri girişi alabilmek için
bunu yazmamız belirtmemiz gerekiyor. */


public class toplama {
    public static void main(String[] args) {
        Scanner giris =new Scanner(System.in) ;

        System.out.print("1.sayıyı giriniz: ");
        int sayi1 = giris.nextInt();

        System.out.print("2. sayıyı giriniz:");
        int sayi2 = giris.nextInt();

        int toplam = sayi1 + sayi2 ;
        System.out.println("sayıların toplamı:" + toplam);

        giris.close();
    }
}
