//txt Dosyada güncelleme yapma1. Orijinal dosyayı okumak için aç.
//2. Yeni (geçici) bir dosyayı yazmak için aç.
//3. İlk satıra konumlan
//4. Satırı oku (siradakiSatir)
//5. Eğer siradakiSatir değiştirmek istediğin satıra eşit ise:
//Yeni içeriği yeni dosyaya yaz.
//değil ise:
//siradakiSatir olduğu gibi yeni dosyaya yaz.6. Bir sonraki satıra geç.
//7. Eğer okunabilecek satır var ise 4.adıma git
//8. Her iki dosyayı da kapat.
//9. Orijinal dosyayı sil.
//10. Yeni dosyayı, orijinal dosyanın adıyla yeniden adlandır.

package hafta11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class o2 {
    public static void main(String[] args) throws Exception{
        String eskiDosyaAdi = "d:\\ogrenciler\\yeniklasor3\\dosya.txt";
        String geciciDosyaAdi = "d:\\ogrenciler\\yeniklasor3\\gecicidosya.txt";

        Path eskiDosyaYolu = Paths.get(eskiDosyaAdi);
        Path geciciDosyaYolu = Paths.get(geciciDosyaAdi);

        File eskiDosya = new File(eskiDosyaAdi);
        File geciciDosya = new File(geciciDosyaAdi);
        geciciDosya.createNewFile();

        FileWriter yeniyeYaz = new FileWriter(geciciDosyaAdi);

        BufferedReader eskiyiOku = new BufferedReader(new FileReader(eskiDosya));
        String satir = eskiyiOku.readLine();
        while(satir != null){
            if(satir.equals("luna")){
                yeniyeYaz.write("lina\n");
                satir = eskiyiOku.readLine();
            }else{
                yeniyeYaz.write(satir + "\n");
                satir = eskiyiOku.readLine();
            }
        }
        yeniyeYaz.close();
        eskiyiOku.close();

        eskiDosya.delete();

        Files.move(geciciDosyaYolu,eskiDosyaYolu,StandardCopyOption.REPLACE_EXISTING);

    }
    
}
