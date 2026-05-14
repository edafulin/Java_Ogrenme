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
