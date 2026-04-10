/*2. Satır ve sütun sayısı klavyeden girilecek iki boyutlu sayısal diziye 50-100 
arasında rastgele sayılardan değer atanacaktır. Değer atandıktan sonra her bir 
satırın aritmetik ortalamasını bulup ekrana yazdıran programı yazınız.  */

package hafta6;
import java.util.Random;
import java.util.Scanner;

public class sour5 {
    public static void main(String[] args) {
        Scanner grs = new Scanner(System.in);
        Random rnd = new Random();

        System.out.print("dizi kaç satırlı olsun:");
        int satir = grs.nextInt();

        System.out.print("dizi kaç sütunlu olsun:");
        int sutun = grs.nextInt();

        int dizi[][] = new int [satir][sutun];

        for(int i = 0 ; i < satir ; i++){
            for (int j = 0 ; j < sutun ; j++){
                dizi[i][j] = rnd.nextInt(50,101);
                System.out.println((i+1) + ". satır" + (j+1) + ".sütun elemanı: " + dizi[i][j]);
            }
        }

        int toplam=0;
        int ort=0 ;

        for(int i = 0 ; i < satir ; i++){
            for (int j = 0 ; j < sutun ; j++){
                toplam = toplam + dizi[i][j];
            }
            ort = toplam / sutun;
            System.out.println(i+1 +". satırın ortalaması:" + ort);
        }
        grs.close();
    }
    
}
