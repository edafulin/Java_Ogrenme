/*
Ekmeği 5 TL, poğaçayı 7,5TL, simidi 5 TL 'den satan 
bir fırıncı kazancının %18'i vergi vermektedir. 
Fırıncının sattığı ürün sayısı ürün çeşitlerine 
göre kazancı ve ödemesi gereken vergi bilgilerini yazdırınız. */

package hafta2;
import java.util.Scanner;

public class firinkazanc {
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);

        System.out.println("kaç tane ekmek sattınız?");
        int ekmek = giris.nextInt();

        System.out.println("kaç tane poğaça sattınız?");
        int pogaca = giris.nextInt();

        System.out.println("kaç tane simit sattınız?");
        int simit = giris.nextInt();

        double kazanc = ekmek*5 + pogaca*7.5 + simit*5 ;

        double vergi = kazanc*18/100;

        System.out.println("ödemeniz gereken vergi:" + vergi);
        System.out.println("net kazancınız:" + kazanc);

        giris.close();
    }
}
