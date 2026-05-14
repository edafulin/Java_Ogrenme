package hafta11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class dosyayiokuma {
    public static void main(String[] args) throws Exception {
        String dosyaAdi = "d:\\ogrenciler\\yeniklasor0\\yenidosya0.txt";
        //Karakter karakter okuma:
        FileReader fr = new FileReader(dosyaAdi);
        int sonuc = fr.read();
        while(sonuc!= -1){
            System.out.println((char)sonuc);
            sonuc=fr.read();
        }
        fr.close();
        System.out.println("****************");
        //Satır satır okuma:
        BufferedReader oku = new BufferedReader(new FileReader(dosyaAdi));
        //FileReader'ı performans artışı ve satır satır okuma yeteneği 
        //için BufferedReader nesnesiyle wrap eder.
        String satir = oku.readLine();
        while(satir != null){
            System.out.println(satir);
            satir = oku.readLine();
            //readLine() metodu her çağrıldığında metin dosyasından bir tam satır okunur
            // ve arka planda okuduğu yeri aklında tutarak 
            //İMLECİ BİR ALT SATIRA GÖNDERİR. Böylece her çalıştığında alt satırı okur.
        }
        oku.close();
        System.out.println("******************");
        //Tüm dosyayı bir listeye aktarmak:
        Path dosyaYolu = new File(dosyaAdi).toPath();
        List <String> liste = Files.readAllLines(dosyaYolu);
        for(String satir2 : liste){
            System.out.println(satir2);
        }
        System.out.println("***********");
        //Diziye de aktarıp yazdırabiliriz.
        String[] dizi1 = liste.toArray(new String[]{});
        for(int i =0; i< dizi1.length ; i++){
        System.out.println(dizi1[i]);
        }
        System.out.println("*********");
        //Listeyi diziye çeviren farklı bir yol:
        String [] dizi2 = liste.toArray(new String[liste.size()]);
        for(int i=0; i< liste.size(); i++){
            System.out.println(dizi2[i]);
        }

        

    }
    
}
