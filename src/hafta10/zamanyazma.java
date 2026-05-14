package hafta10;
import java.util.Date;//Date için bunu çağırdık
//Date sınıfı en eski java 8 öncesi bir sınıftır.
//İçinde saat dakika ve saniyeyi de bulundurur.
import java.time.LocalDate;//LocalDate için bunu çağırdık
//java8 sonrası yeni bir sınıftır. Saatle dakikayla işi olmaz 
//sadece tarihi kayıt eder.

public class zamanyazma {
    public static void main(String[] args) {
        Date tarih = new Date();
        System.out.println(tarih); //"Sat May 09 09:18:45 TRT 2026" çıktımız bu olur.
        System.out.println(tarih.toString()); //"Sat May 09 09:18:45 TRT 2026" çıktımız değişmez.

        //her ikisinde de aynı sonucun çıkması aslında Date sınıfının içinden bu tarihi
        //çekerken ekrana yazadırma kısmında .toString e uğrayarak gelir.
        //Dolayısıyla bizim sonradan yazmamız veya yazmamamız etkilemez.

        //new Date kodu çalıştığında Java evrensel bir zamanı (İngiltere'deki Greenwich - UTC)
        //baz alır ama toString() ile bu saat ekrana yazdırılınca, Java bilgisayarın
        //işletim sistemine bakar o da Türkiye ye ayarlı olduğundan Turkey Time TRT olur.

        LocalDate tarih2 = LocalDate.now();
        System.out.println(tarih2); //"2026-05-09" çıktı güzel olarak yazılır.
        System.out.println(tarih2.toString());//"2026-05-09" çıktı güzel olarak yazılır.
        //Date gibi LocalDatede de bu durum geçerli o yüzden çıktılar aynıdır.

        //Bunda TRT yazmıyor çünkü o saate bakmaz genel dünya genelindeki takvimi alır ve yazar.
        //Date i değiştirebiliriz ama LocalDate i değiştiremeyiz onu değiştirmek için
        //özel komut satırını kullanırız. Bu yüzden date den daha çok tercih ediliri local date java 8 den sonra çıkmıştır.
        LocalDate tarih3 = LocalDate.now();
        System.out.println(tarih);
        LocalDate tarih4 = tarih3.plusDays(2);
        System.out.println(tarih2);
    }
    
}
