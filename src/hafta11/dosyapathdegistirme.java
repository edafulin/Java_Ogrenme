package hafta11;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;


public class dosyapathdegistirme {
    public static void main(String[] args) {
        //Dosyanın yerini değiştirdik.
        String yol = "d:\\ogrenciler\\yeniklasor0\\yenidosya2.txt";
        String varis = "d:\\ogrenciler\\yeniklasor1\\yenidosya2.txt";
        Path ilkYer = Paths.get(yol);
        Path yeniYer = Paths.get(varis);
        try{
        Files.move(ilkYer,yeniYer,StandardCopyOption.REPLACE_EXISTING);
        System.out.println("dosya tasindi.");
        }catch(Exception e){
            System.out.println("hata oluştu");
        }
        //Dosyanın adını değiştirdik.
        String adYolu = "d:\\ogrenciler\\yeniklasor1\\yenidosya2.txt";
        String yeniAdi = "d:\\ogrenciler\\yeniklasor1\\adiDegismisDosya.txt";
        Path eskiAd = Paths.get(adYolu);
        Path yeniAd = Paths.get(yeniAdi);
        try{
            Files.move(eskiAd, yeniAd, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("dosyanin adi degisti.");
        }catch(Exception e){
            System.out.println("sorun oluştu.");
        }
    }
    
}
