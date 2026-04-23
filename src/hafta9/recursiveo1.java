//karelerinToplami(int sayi) adlı kendini çağıran bir metot yazınız. 
// Metot kendisine parametre olarak yollanan sayıdan bire(1) kadar 
//olan sayıların karelerinin toplamını bulup geri döndürecektir.
// Eğer parametre olarak yollanan sayı 0 veya negatif ise “Hesaplama 
//İşlemi Yapılamaz.” Şeklinde bir mesajı ekrana yazdırıp geriye -1 döndürecektir. 

package hafta9;

import java.util.Scanner;

public class recursiveo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("istediginiz sayiyi girin:");
        int sayi = input.nextInt();
        System.out.print("karelerin toplamı:" + kareleriTopla(sayi));

        input.close();
        
    }
    public static int kareleriTopla (int sayi){
        int toplam=0;
        if (sayi <= 0){
            System.out.println("hesaplama islemi yapilamaz.");
            return -1;
        }
        if(sayi==1){
            return 1 ;
        }
        int suankiSayininKaresi = sayi*sayi;
        int kalanKisim = kareleriTopla(sayi-1);
        toplam = suankiSayininKaresi + kalanKisim;
        return toplam;
    }
}
