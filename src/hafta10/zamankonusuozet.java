package hafta10;
import java.util.Date; // Date sınıfını kullanmak için içe aktarır.
import java.time.LocalDate; //LocalDate sınıfını kullanamya yarar.
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import java.util.Calendar;
import java.text.ParseException;
import java.util.concurrent.TimeUnit; // TimeUnit işlemi için zorunlu kütüphane

public class zamankonusuozet {
    public static void main(String[] args) {
System.out.println("**************Java8 öncesi eski tarih işlemleri********************");
//Java8 öncesi eski tarih işlemleri
        Date tarihSaat = new Date();
        // O anki tarih ve saati tutan yeni bir nesne oluşturur.
        System.out.println(tarihSaat.toString());
        // Tarihi standart İngilizce olarak ekrana yazdırır.

        // unix timestap kavramı:
        System.out.println("Timestamp : " + tarihSaat.getTime());
        //1 Ocak 1970'ten şu ana kadar geçen zamanı milisaniye 
        //cinsinden sayı olarak verir.

System.out.println("****************yeni tarih işlemlerinde kullanılan yapı*****************");
// yeni tarih işlemlerinde kullanılan yapı
        LocalDate tarih = LocalDate.now(); // Doğrusu budur! O anki tarihi alır.
        System.out.println(tarih);

        LocalDate tarih2 = tarih.plusDays(2); // Mevcut tarihe 2 gün ekler.
        System.out.println(tarih2);
        //LocalDate in tercih edilme kısmı burasıdır. Tarih içine bir tarih atandığında
        //değiştiremezsin. Yeni tarih oluşturmak için yeni bir değişken yazmamız gerekir.
        //Bu da tarihlerde işlem yaparken karışıklık olmasını önler.

System.out.println("***************Tarihleri istediğimiz gibi yazdırma******************");
//Tarihleri istediğimiz gibi yazdırma
        //yıl--> yyyy
        //ay --> MM      dakika --> mm olduğundan.
        //Gün --> dd
        Date tarihSaat2 = new Date();
        DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd"); 
        System.out.println(df1.format(tarihSaat2)); // Çıktı: 2020/05/11 gibi olur

        DateFormat df2 = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(df2.format(tarihSaat2)); // Çıktı: 11.05.2020 gibi olur

        //M	    5	    En sade sayı: Gereksiz sıfırları atar.
        //MM	05	    Sabit sayı: Her zaman 2 hane verir (01, 02...12).
        //MMM	May	    Kısa metin: Ayın isminin kısaltmasını verir.
        //MMMM	Mayıs	Tam metin: Ayın ismini tam haliyle yazar.
         DateFormat df3 = new  SimpleDateFormat("dd.MMMM.yyyy" , new Locale("tr"));
         System.out.println(df3.format(tarihSaat2));

System.out.println("****************Format ve parse arasındaki fark**************************");
//Format ve parse arasındaki fark
        // .format tarih nesnesini başındaki formatla stringe çevirirki ekrana yazdırabilelim.
        Date tarihSaat3 = new Date();
        DateFormat df4 = new  SimpleDateFormat("dd MM yyyy" , new Locale("tr"));
        System.out.println(df4.format(tarihSaat3));
        //.parse başındaki formatla stringi nesneye çevirir.
        //olası bir metin uyuşmazlığında sistemin çömemesi için güvenli bölge yapmamız gerekir.
        try{
        System.out.println(df4.parse("22 12 2006"));
        }catch(ParseException e)
        {
            System.out.println("tarih ile format uyuşmuyor.");
        }
System.out.println("*******************Takvim İşlemleri********************");
//Takvim işlemleri Calendar sınıfı.
        
        // O anki takvim nesnesini oluşturur
        Calendar simdi = Calendar.getInstance();
        System.out.println(simdi.get(Calendar.MONTH));  // Sadece Ay bilgisini getirir (Sayısal)
        System.out.println(simdi.get(Calendar.DATE));   // Sadece Gün bilgisini getirir
        System.out.println(simdi.get(Calendar.YEAR));   // Sadece Yıl bilgisini getirir
        System.out.println(simdi.get(Calendar.HOUR));   // Sadece Saat bilgisini getirir

        //Takvime Gün Ekleme/Çıkarma
        System.out.println("Şuanki Tarih = " + simdi.getTime()); // Anlık tarihi verir

        simdi.add(Calendar.DATE, -2); // Tarihten 2 gün geriye gider (-2)
        System.out.println("Yeni Tarih = " + simdi.getTime());
//iki tarih arasındaki farkı bulmak (sınavda yok)
System.out.println("*******************İki Tarih Arasındaki Fark");

        DateFormat df5 = new SimpleDateFormat("dd MM yyyy");
        // bunları try ın dışında oluşturmalıyız ki hata verirse java dediğin şey nerde demesin.
        Date firstDate = null;
        Date secondDate = null;

        try{// burda hata olma ihtimalinden dolayı javaya yetki vermeliyiz.
        
        firstDate = df5.parse("06 09 2005");
        System.out.println("tarih1:" + df5.format(firstDate).toString());

        secondDate = df5.parse("22 12 2006");
        System.out.println("tarih2:" + df5.format(secondDate).toString());

        long  diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());

        long diffInDays = TimeUnit.DAYS.convert(diffInMillies , TimeUnit.MILLISECONDS);

        System.out.println("arasındaki milisaniye farkı:" + diffInMillies);
        System.out.println("arasındaki gün farkı:" + diffInDays);

        double fark = diffInDays / 365.0 ;
        System.out.println("arasındaki yıl farkı :" +  fark);

        double ayfarki = diffInDays / 30.0 ;
        System.out.println("arasındaki ay farkı :" + ayfarki);

        }
        catch(ParseException e){
            System.out.println("hata oldu!");
        }

        
    }    
}
