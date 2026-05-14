package hafta11;

import java.io.FileWriter;

public class dosyayaveriekleme {
    public static void main(String[] args) throws Exception {
        String dosyaAdi = "d:\\ogrenciler\\yeniklasor0\\yenidosya0.txt";
        FileWriter dosyayaYaz = new FileWriter(dosyaAdi,true);
        dosyayaYaz.write("Eda Fulin\n");
        dosyayaYaz.write("Ece\n");
        dosyayaYaz.write("Fırat\n");
        dosyayaYaz.close();
        //satır -->8 false yazarsak veya hiçbir şey yazmazsak dosyadaki eski diğer verileri siler ve 
        //yenilerini yazar dolayısıyla true yazarsak sonuna ekler
        String yeniDosyaAdi = "d:\\ogrenciler\\yeniklasor0\\yenidosya1.txt";
        FileWriter fw = new FileWriter(yeniDosyaAdi,false);
        //Daha önceden dosya olsun veya olmasın, dosyayı siler ve yeni içi boş bir dosya oluşturur.
        //Bilgileri ilk satırdan itibaren yazar. Yani bu şekilde dosya açılırsa ilk veriler silinir.
        FileWriter fw2 = new FileWriter(yeniDosyaAdi,true);
        fw2.write("silinmişmi?3\n");
        //fw2.close(); satırını fw.close(); dan önce yazarsak false olan siler yani ama 
        //true yu false dan sonra kapatırsak true yazılır ancak en sona eklenir.
        //False bencildir sadece kendi yazdırdıklarını yazdırır. dolayısıyla false u önce 
        //kapatırsak true sonradan ekleme yapabilir false kaydetmiş olur çoktan
        fw.write("silinmişmi?1\n");
        fw.write("silinmişmi?2\n");
        fw.close();
        fw2.close();
        //DOSYADAN VERİ SİLMEK İÇİNDE FALSE YAZARIZ VEYA HİÇBİR ŞEY YAZMAYIZ 
        //WRİTE DA "" YAZARSAK DOSYAYA BİR ŞEY YAZMAMIŞ VE VERİLERİ SİLİNMİŞ OLURUZ.
        FileWriter sil = new FileWriter(yeniDosyaAdi);
        sil.write("");
        sil.close();//Yeni dosyadaki veriler silindi

    }
    
}
