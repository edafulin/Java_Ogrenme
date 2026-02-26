/*Yaz okulu ücretlerini hesaplayan bir programın yazılması istenmektedir. Öncelikle kullanıcı 
dersi hangi fakülteden alacak onun bilgisi girilmelidir. Teknoloji Fakültesi için TF, Mühendislik 
Fakültesi için MF, Eğitim Fakültesi için EF bilgisi girilmektedir. Öğrenciye daha sonra hangi dersi 
alacağı sorulacaktır. Öğrencinin Fizik 1 için FİZ1, Fizik 2 için FİZ2, Kalkülüs 1 için KLK1 ve Kalkülüs 
2 için KLK2 bilgisi girişi yapmaktadır. Öğrenci sadece fakülte seçimi ve 1 ders seçimi yapacaktır. 
Eğer dersi Teknoloji Fakültesinden alıyorsa ders saati başına 20TL, eğer dersi Mühendislik 
Fakültesinden alıyorsa ders saati başına 22TL, eğer dersi Eğitim Fakültesinden alıyorsa ders 
saati başına 19TL ödemesi gerekiyor. Fizik 1 ve Fizik 2 derslerinin ders saati 3, Kalkülüs 1 ve 
Kalkülüs 2 derslerinin ders saati 4 tür. 
Klavyeden fakülte ve ders bilgisi girildikten sonra ödemesi gereken yaz okulu ücretini ekrana 
yazdıran programın kodlarını yazınız. */
package Odev1.alistirma2;
import java.util.Scanner;
public class yazokuluodeme {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("dersinizi hangi fakülteden alacaksınız? \n telknoloji fakültesi için TF \n Mühendislik Fakültesi için MF \n Eğitim fakültesi için EF giriniz.");
        String fakulte = giris.nextLine();
        System.out.println("hangi dersi alacaksınız ? \n Fizik1 --> FİZ1 \n Fizik2 --> FİZ2 \n Kalkülüs 1 --> KLK1 \n Kalkülüs 2 --> KLK2");
        String ders = giris.nextLine();
        /*Burda BUFFER olayı denen durum ortaya çıkmıştır. nextLine yerine next yazdığınız zaman
        sistem enter ı \n olarak algılıyor ve program çalışmıyor. Enter tuşu diğer klavye girişinde 
        enter ı almasın diye nextLine kullanmalıyız. */

        if (fakulte.equals("TF")){
            int saatt = 20;
            if( ders.equals("FİZ1")||ders.equals("FİZ2")){
                int odeme = 3*saatt;
                System.out.println("Ödemeniz gereken miktar =" + odeme);
            }
            if( ders.equals("KLK1")||ders.equals("KLK2")){
                int odeme = 4*saatt;
                System.out.println("Ödemeniz gereken miktar =" + odeme);
            }
        }
        if (fakulte.equals("MF")){
            if (ders.equals("FİZ1")||ders.equals("FİZ2")){
                int odeme = 3*22;
                System.out.println("Ödemeniz gereken miktar= " + odeme);
            }
            if (ders.equals("KLK1")||ders.equals("KLK2")){
                int odeme = 4*22;
                System.out.println("Ödemeniz gereken miktar= " + odeme);
            }
        }
        if (fakulte.equals("EF")){
            int saate = 19;
            if (ders.equals("FİZ1")||ders.equals("FİZ2")){
                int odeme = 3*saate;
                System.out.println("Ödemeniz gereken miktar= " + odeme);
            }
            if (ders.equals("KLK1")||ders.equals("KLK2")){
                int odeme = 4*saate;
                System.out.println("Ödemeniz gereken miktar= " + odeme);
            }
        }

        giris.close();
    }
    
}
