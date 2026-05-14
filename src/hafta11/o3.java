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

import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class o3 {
    public static void main(String[] args) throws Exception{
        List<String> liste = new ArrayList<>(); 

        String DosyaAdi = "d:\\ogrenciler\\yeniklasor4\\dosya.txt";

        BufferedReader oku = new BufferedReader(new FileReader(DosyaAdi));

        String eleman = oku.readLine();
        while(eleman != null){
            if(eleman.equals("istenmeyen")){
                eleman = oku.readLine();
            }else{
                liste.add(eleman);
                eleman = oku.readLine();
            }
        }
        oku.close();

        FileWriter yaz = new FileWriter(DosyaAdi, false);
        for(String satir : liste){
            yaz.write(satir + "\n");
        }
        yaz.close();
    }
    
}
