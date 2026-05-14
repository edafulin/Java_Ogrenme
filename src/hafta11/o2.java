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
