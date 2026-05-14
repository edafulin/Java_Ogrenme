package hafta10;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class zamanyazimstiller {
    public static void main(String[] args) {
        Date tarihSaat = new Date();
        System.out.println(tarihSaat);

        //********************************************************* */
        //-------Yazım şeklini değiştirmek---------
        //yıl--> yyyy
        //ay --> MM      dakika --> mm olduğundan.
        //Gün --> dd
        DateFormat df1 = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(df1.format(tarihSaat));

        DateFormat df2 = new  SimpleDateFormat("dd.MMMM.yyyy" , new Locale("tr"));
        //M	    5	    En sade sayı: Gereksiz sıfırları atar.
        //MM	05	    Sabit sayı: Her zaman 2 hane verir (01, 02...12).
        //MMM	May	    Kısa metin: Ayın isminin kısaltmasını verir.
        //MMMM	Mayıs	Tam metin: Ayın ismini tam haliyle yazar.
        
        //SimpleDateFormat df2 = new  SimpleDateFormat("dd.MM.yyyy"); da yazabiliriz ama üstteki tercih edilir.
        System.out.println(df2.format(tarihSaat));

        // Javada new DateFormat diye  bir tarih oluşturamayız. 
        // Tarihi formata çeviren birşeyler olmalıdır.
        // SimpleDateFormat budur işte bir formattır
        
    }
    
}
