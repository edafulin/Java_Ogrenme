package hafta3;
import java.util.Scanner;
/*mainin içine yazılan değişkenler local değişkendir eğer ki
biz başlangıç değeri atamazsak hiç değer atamama durumu olma 
ihtimali olduğu zamanlarda java bunun derlemez örneğin aşağıda
sonuc değişkeni if kalıplarından hiçbiri gerçekleşmezse yani 
boolean değeri hep false çıkarsa sonuc değişkenine değer atanmaz
böylece java çalışmaz o yüzden her zaman en başta local değişkenlere 
değer atanmalıdır. */
public class localdegisken {
    public static void main(String[] args) {
        
        Scanner giris = new Scanner(System.in);

        System.out.println("1.sayıyı giriniz.");
        double sayi1 = giris.nextDouble();

        System.out.println("2.sayıyı giriniz.");
        double sayi2 = giris.nextDouble();

        System.out.println("yapmak istediğiniz işlemi giriniz:");
        char islem = giris.next().charAt(0);

        double sonuc;

        if(islem == '+'){
            sonuc = sayi1+sayi2;
            System.out.println(sonuc) ;
        }

        else if(islem == '-'){
                sonuc = sayi1-sayi2;
            System.out.println(sonuc) ;
            }
        else if(islem == '*'){
                sonuc = sayi1*sayi2;
            System.out.println(sonuc) ;
            }
        else if(islem == '/'){
                sonuc = sayi1/sayi2;
            System.out.println(sonuc) ;
            }
        giris.close();

    }

}
