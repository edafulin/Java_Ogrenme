//txt Dosyada silme işlemi1. Orijinal dosyayı okumak için aç.
//2. Yeni (geçici) bir dosyayı yazmak için aç.
//3. İlk satıra konumlan
//4. Satırı oku (siradakiSatir)
//5. Eğer siradakiSatir silmek istediğin satıra
//eşit ise:
//bu satırı dosyaya yazma.
//değil ise:
//siradakiSatir olduğu gibi yeni dosyaya yaz.6. Bir sonraki satıra geç.
//7. Eğer siradakiSatir son satır değil ise 4.adıma git8. Her iki dosyayı da kapat.
//9. Orijinal dosyayı sil.
//10. Yeni dosyayı, orijinal dosyanın adıyla yeniden adlandır.

package hafta11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Paths;
import java.nio.file.Path;

public class o1 {
    public static void main(String[] args) throws Exception{
        String eskiDosyaAdi = "d:\\ogrenciler\\yeniklasor2\\eskidosya.txt";
        String geciciDosyaAdi = "d:\\ogrenciler\\yeniklasor2\\gecicidosya.txt";

        File eskiDosya = new File("d:\\ogrenciler\\yeniklasor2\\eskidosya.txt");

        File geciciDosya = new File("d:\\ogrenciler\\yeniklasor2\\gecicidosya.txt");
        geciciDosya.createNewFile();

        FileWriter yeniyeYaz = new FileWriter(geciciDosya,true);

        BufferedReader eskiDosyayiOku = new BufferedReader(new FileReader(eskiDosyaAdi));
        String satir  = eskiDosyayiOku.readLine();
        while(satir != null){
            if(!satir.equals("lina")){
            yeniyeYaz.write(satir + "\n");
            }
            satir = eskiDosyayiOku.readLine();
        }
        yeniyeYaz.close();
        eskiDosyayiOku.close();
        eskiDosya.delete();

        Path eskiDosyaYolu = Paths.get(eskiDosyaAdi);
        Path geciciDosyaYolu = Paths.get(geciciDosyaAdi);

        Files.move(geciciDosyaYolu,eskiDosyaYolu,StandardCopyOption.REPLACE_EXISTING);

        


    }
    
}
