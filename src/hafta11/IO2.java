package hafta11;

import java.io.File;
import java.io.IOException;

public class IO2 {
    public static void main(String[] args) throws IOException{
        //bir sürü dosya ve klasör oluşturma
        for (int i=0 ; i<10 ; i++){
            File klasor = new File("d:\\ogrenciler\\yeniklasor" + i);
            if(!klasor.exists()){
                klasor.mkdir();
            }
        }
        for(int i=0; i<10 ; i++){
            File dosya = new File("d:\\ogrenciler\\yeniklasor0\\yenidosya" + i + ".txt");
            if(!dosya.exists()){
                dosya.createNewFile();
            }
        }
        //dosyaların bilgilerini almak
        File dosyaa = new File("d:\\ogrenciler\\yeniklasor0\\yenidosya0.txt");
        System.out.println("dosyanın diskteki tam yolu:\n" + dosyaa.getAbsolutePath());
        System.out.println("dosya tanımlanırken girilen yol:\n" + dosyaa.getPath());
        System.out.println("dosyanın içinde bulunduğu üst klasörün yolu:\n" + dosyaa.getParent());
        System.out.println("dosyanın adı ve uzantısı:\n" + dosyaa.getName());

        //bir klasördeki tüm dosyaların adını yazdırmak:
        File klasorr = new File("d:\\ogrenciler");
        String[] isimler = klasorr.list();
        for (String isim : isimler){
            System.out.println(isim);
        }
        //Klasörün içindeki klasör ve dosyaların isimlerini string değil de nesne dizisi olarak alma
        //bu her dosya ya da klasorün sadece ismi yazdırmak için değil bilgilerini çekmemize de yardımcı olur.
        File file = new File("d:\\ogrenciler");
        File [] dosyalar = file.listFiles();
        for (File dosya : dosyalar){
            System.out.println(dosya.getName() + "=" + dosya.getPath());
        }
        
    }
    
}
