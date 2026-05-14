//txt Dosyada güncelleme yapma1. Dosyayı okumak için aç.
//2. Tüm satırları bir listeye satır satır olarak yükle
//(listeSatirlar). (Her satır, listenin bir elemanı olacak.)
//3. Dosyayı kapat.
//4. Listenin ilk elamanına konumlan
//5. Listenin sıradaki satırı oku (siradakiSatir)
//6. Eğer siradakiSatir değiştirmek istediğin satıra
//eşit ise:
//listenin o elemanını Yeni içerik ile değiştir.
//değil ise:
//listenin o elemanına bir değişiklik uygulama.
//7. Bir sonraki satıra geç.
//8. Eğer okunabilecek satır var ise 5.adıma git
//9. Dosyayı tekrar yazmak için aç.
//(Aynı dosya adıyla, write modunda açarak içeriği yaz.FileWriter(dosyaAdi,false); )
//10. Tüm güncellenmiş satırları yani listeyi dosyaya sırayla yaz.11. Dosyayı kapat

package hafta11;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class o4 {
    public static void main(String[] args) throws Exception {
        String dosyaAdi ="d:\\ogrenciler\\yeniklasor5\\dosya.txt";
        List<String> liste = new ArrayList<>();
        BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));

        String eleman  = oku.readLine();
        while(eleman != null){
            if(eleman.equals("değiştir")){
                liste.add("şükrü");
                eleman = oku.readLine();
            }else{
                liste.add(eleman);
                eleman = oku.readLine();
            }
        }
        oku.close();
        FileWriter yaz = new FileWriter(dosyaAdi,false);
        for (String satir : liste){
            yaz.write(satir + "\n");
        }
        yaz.close();
    }
    
}
