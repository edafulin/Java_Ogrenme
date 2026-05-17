import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;

public class Odev_2416501024 {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        char cevap1 = 0;
        while(cevap1 != '5'){
        System.out.println("************MENU************");
        System.out.println("1 -->Verileri Çek");
        System.out.println("2 -->Listele");
        System.out.println("3 -->Güncelle");
        System.out.println("4-->Sil");
        System.out.println("5-->Çıkış");
        cevap1 = scanner.next().charAt(0);
        if(cevap1!= '5'){
            switch(cevap1){
                case '1':
                    verileriCek();
                    break;
                case '2':
                    System.out.println("a-->Markaya göre listele");
                    System.out.println("b-->Ürün türüne göre listele");
                    System.out.println("c-->Fiyata göre listele");
                    System.out.println("d-->Hepsini listele");
                    char cevap2 = scanner.next().charAt(0);
                    scanner.nextLine();
                    if(cevap2 == 'a') markayaGoreListele();
                    else if(cevap2 == 'b') urunTuruneGoreListele();
                    else if (cevap2 == 'c') fiyataGoreListeleme();
                    else if (cevap2 == 'd') hepsiniListele();
                    break;
                case '3':
                    guncelleme();
                    break;
                case '4':
                    silme();
                    break;
            }
        }else{
            break;
        }
        }
    }

    public static void verileriCek(){
        try{
        FileWriter yaz = new FileWriter("edaFulinYilmaz.txt",false);

        String apiUrl = "https://makeup-api.herokuapp.com/api/v1/products.json";
        URI uri = URI.create(apiUrl);
        URL url = uri.toURL();
        HttpURLConnection baglanti = (HttpURLConnection) url.openConnection();
        baglanti.setRequestMethod("GET");
        BufferedReader oku = new BufferedReader(new InputStreamReader(baglanti.getInputStream()));
        
        StringBuilder sb = new StringBuilder();
        String satir;
        while((satir=oku.readLine())!=null){
            sb.append(satir);
        }
        oku.close();
        String veriler = sb.toString();
        String [] urunler = veriler.split("\"id\":");

        for (int i = 1; i < 56; i++){
            String urun = urunler[i];
            int virgulYeri = urun.indexOf(",");
            String id = urun.substring(0, virgulYeri).trim();
            String marka = parcaGetir(urun, "\"brand\":");
            String isim = parcaGetir(urun, "\"name\":");
            String fiyat = parcaGetir(urun, "\"price\":");
            String urunLinki = parcaGetir(urun, "\"product_link\":");
            String urunTuru = parcaGetir(urun, "\"product_type\":");
            yaz.write(id + ";");
            yaz.write(marka + ";");
            yaz.write(isim + ";");
            yaz.write(fiyat +";");
            yaz.write(urunLinki + ";");
            yaz.write(urunTuru + "\n");
        }

        String apiUrl2 = "https://dummyjson.com/products/category/beauty";
        URI uri2 = new URI(apiUrl2);
        URL url2 = uri2.toURL();
        HttpURLConnection baglanti2 = (HttpURLConnection) url2.openConnection();
        baglanti2.setRequestMethod("GET");
        BufferedReader oku2 = new BufferedReader(new InputStreamReader(baglanti2.getInputStream()));

        StringBuilder sb2 = new StringBuilder();
        String satir2;
        while((satir2 = oku2.readLine()) != null){
            sb2.append(satir2);
        }
        String veriler2 = sb2.toString();
        String[] urunler2 = veriler2.split("\"id\":");

        for(int i=1 ; i<urunler2.length ; i++){
            String urun = urunler2[i];
            int virgulYeri = urun.indexOf(",", 0);
            String id2 = urun.substring(0,virgulYeri).trim();
            String marka2 = parcaGetir(urun,"\"brand\":");
            String isim2 = parcaGetir(urun, "\"title\":");
            String fiyat2 = parcaGetir(urun, "\"price\":");
            String urunLinki2 = null;
            String urunTuru2 = parcaGetir(urun, "\"tags\":[\"beauty\",").replace("]","");
            yaz.write(id2 + ";");
            yaz.write(marka2 + ";");
            yaz.write(isim2 + ";");
            yaz.write(fiyat2 +";");
            yaz.write(urunLinki2 + ";");
            yaz.write(urunTuru2 + "\n");

        }
        yaz.close();
        File dosya = new File("edaFulinYilmaz.txt");
        System.out.println("VERİ DOSYASININ YOLU: " + dosya.getAbsolutePath());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String parcaGetir (String veri, String anahtar){
        int index = veri.indexOf(anahtar);
        if(index == -1) return null;
            int basla = index + anahtar.length();
            int bitis = veri.indexOf(",", basla);
            return veri.substring(basla, bitis).replace("\"", "").trim();
    }

    public static void markayaGoreListele(){
        String[] markalar = {"alva", "boosh", "c'est moi", "coastal classic creation", "colourpop", 
                             "deciem", "glossier", "green people", "lotus cosmetics usa", "Essence",
                             "maia's mineral galaxy", "marienatie", "nudus", "nyx", "penny lane organics", 
                             "rejuva minerals", "sally b's skin yummies", "w3llpeople", "zorah biocosmetiques",
                             "Glamour Beauty" , "Velvet Touch" , "Chic Cosmetics","Nail Couture"};
        System.out.println("Lütfen Marka Seçiniz:");
        for (int i = 0; i < markalar.length; i++) {
            System.out.println((i + 1) + "- " + markalar[i]);
        }
        int arananSayi =  scanner.nextInt();
        String arananMarka = markalar[arananSayi-1];
        System.out.println("***************" + arananMarka + " markasının ürünleri " + "*************************");
        try{
            BufferedReader oku = new BufferedReader(new FileReader("edaFulinYilmaz.txt"));
            String satir ;
             while( (satir = oku.readLine()) != null){
                String[] ozellikler = satir.split(";");
                if(ozellikler[1].equalsIgnoreCase(arananMarka)){
                    urunYazdir(ozellikler);
                }
            }
            oku.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void urunTuruneGoreListele (){
        String[] urunTurleri = {"blush", "bronzer", "eyebrow", "eyeliner", "eyeshadow", "nail polish",
                                    "foundation", "lip_liner", "lipstick", "mascara","face powder"};
        for(int i=0 ; i<8 ; i++){
            System.out.println((i+1) + "- " + urunTurleri[i]);
        }
        int arananSayi = scanner.nextInt();
        String arananUrunTuru = urunTurleri[arananSayi-1];
        try{
            BufferedReader oku = new BufferedReader(new FileReader("edaFulinYilmaz.txt"));
            String satir = oku.readLine();
            while(satir != null){
                String [] ozellikler = satir.split(";");
                if(ozellikler[5].equalsIgnoreCase(arananUrunTuru)){
                    urunYazdir(ozellikler);
                }
                satir = oku.readLine();
            }
            oku.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void fiyataGoreListeleme(){
        System.out.println("Hangi fiyat aralığını listelemek istersiniz:");
        System.out.println( "a --> 0 - 10$ Arası (Uygun fiyatlılar)\n" +
                            "b --> 10 - 20$ Arası (Orta fiyatlılar)\n" +
                            "c --> 20$ ve Üzeri (Yüksek fiyatlılar)\n" +
                            "d --> fiyatı girilmemiş ürünler");
        char aranan = scanner.next().charAt(0);
        try{
        BufferedReader oku = new BufferedReader(new FileReader("edaFulinYilmaz.txt"));
        String satir ;
        while( (satir = oku.readLine()) != null){
            String [] ozellikler = satir.split(";");
            double fiyat = Double.parseDouble(ozellikler[3]);
                switch(aranan){
                    case 'a':
                        if((fiyat > 0) && (fiyat < 10)){
                            urunYazdir(ozellikler);
                        }
                        break;  
                    case 'b':
                        if((fiyat >= 10) && (fiyat < 20)){
                        urunYazdir(ozellikler);
                        }
                        break;
                    case 'c':
                        if(fiyat >= 20){
                        urunYazdir(ozellikler);
                        }
                        break;
                    case 'd':
                        if(fiyat == 0.00){
                        urunYazdir(ozellikler);
                        }
                        break;
                } 
        }
        oku.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void hepsiniListele() {
        try{
            BufferedReader oku = new BufferedReader(new FileReader("edaFulinYilmaz.txt"));
            String satir ;
             while( (satir = oku.readLine()) != null){
                String [] ozellikler = satir.split(";");
                urunYazdir(ozellikler);
            }
            oku.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void guncelleme (){
        System.out.println("a -->Fiyat bilgisini güncelle");
        System.out.println("b -->Ürün ismini güncelle");            
        System.out.println("c -->Ürün linkini güncelle");
        System.out.println("d -->Ürün markasını güncelle");
        char cevap3 = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.print("güncellemek istediğiniz ürünün ID'sini girin:");
        int degisecekId = scanner.nextInt();
        scanner.nextLine();

        StringBuilder hafiza = new StringBuilder();
        try{
            BufferedReader oku = new BufferedReader(new FileReader("edaFulinYilmaz.txt"));
            String satir ; 
            int idVar = 0;
            while((satir = oku.readLine()) != null){
                String [] ozellikler = satir.split(";");
                int ID = Integer.parseInt(ozellikler[0]);
                if(ID == degisecekId){
                    idVar = 1;
                    urunYazdir(ozellikler);
                  System.out.println("Güncellemek istediğiniz ürün bu mu ? (e/h)");
                    char cevap = scanner.next().charAt(0);
                    scanner.nextLine();
                        if(cevap == 'e' || cevap == 'E'){
                            if(cevap3 == 'a')  satir = fiyatGuncelleme(ozellikler);
                            else if (cevap3 == 'b') satir = isimGuncelleme(ozellikler);
                            else if (cevap3 == 'c') satir = urunLinkiniGuncelle(ozellikler);
                            else if (cevap3 == 'd') satir = markaGuncelleme(ozellikler);
                        }else{
                            System.out.println("Yanlış ürün ID'si girmişsiniz. Ana menüye yönlendirildiniz.");
                            oku.close();
                            return;
                        }
                }
            hafiza.append(satir + "\n");
            }
            oku.close();
            if(idVar == 1){
            FileWriter yaz = new FileWriter("edaFulinYilmaz.txt",false);
            yaz.write(hafiza.toString());
            yaz.close();
            System.out.println("Bilgiler güncellendi , ana menüye yönlendirildiniz.");
            }else{
                System.out.println("Böyle bir ID yok, Ana menüye yönlendirildiniz.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static String fiyatGuncelleme(String[] ozellikler) {
        System.out.print("Yeni fiyatı giriniz: ");
                            String yeniFiyat = scanner.nextLine();
        String satir = ozellikler[0] + ";" + ozellikler[1] + ";" + ozellikler[2] + ";" + 
                        yeniFiyat + ";" + ozellikler[4] + ";" + ozellikler[5];
        
        return satir;
    }

    public static String isimGuncelleme(String [] ozellikler) {
        System.out.print("Yeni ismi giriniz: ");
        String yeniIsim = scanner.nextLine();
        String satir = ozellikler[0] + ";" + ozellikler[1] + ";" + yeniIsim + ";" + 
                       ozellikler[3] + ";" + ozellikler[4] + ";" + ozellikler[5];
        return satir;                 
    }

    public static String urunLinkiniGuncelle(String[] ozellikler) {
        System.out.print("Yeni linki giriniz: ");
        String yeniLink = scanner.nextLine();
        String satir = ozellikler[0] + ";" + ozellikler[1] + ";" + ozellikler[2] + ";" + 
                ozellikler[3] + ";" + yeniLink + ";" + ozellikler[5];
        return satir;       
    }
    
    public static String markaGuncelleme(String[] ozellikler) {
        System.out.print("Yeni markayı giriniz: ");
        String yenimarka = scanner.nextLine();
        String satir = ozellikler[0] + ";" + yenimarka + ";" + ozellikler[2] + ";" + 
                       ozellikler[3] + ";" + ozellikler[4] + ";" + ozellikler[5];
        return satir;       
    }

    public static void silme(){
    System.out.println("a --> Ürün sil");
    System.out.println("b --> Ürün linkini sil");
    char cevap4 = scanner.next().charAt(0);
    scanner.nextLine();

        System.out.print("Silmek istediğiniz ürünün ID'sini girin:");
        int silinecekId = scanner.nextInt();
        scanner.nextLine();
        int idVar = 0;
        try{
            BufferedReader oku = new BufferedReader(new FileReader("edaFulinYilmaz.txt"));
            String satir;
            StringBuilder hafiza = new StringBuilder();
            while((satir = oku.readLine()) != null){
                String [] ozellikler = satir.split(";");
                int ID = Integer.parseInt(ozellikler[0]);
                if(ID == silinecekId){
                    idVar = 1;
                    urunYazdir(ozellikler);
                    System.out.println("Silmek istediğiniz ürün bu mu ? (e/h)");
                    char cevap = scanner.next().charAt(0);
                    scanner.nextLine();
                        if(cevap == 'e' || cevap == 'E'){
                        if(cevap4 == 'a') satir = null;
                        if(cevap4 == 'b') satir = urunLinkiSilme(ozellikler);
                        }else{
                        System.out.println("Yanlış ürün ID'si girmişsiniz. Ana menüye yönlendirildiniz.");
                        oku.close();
                        return;
                        }
                }
            hafiza.append(satir);
            }
            oku.close();

            if(idVar == 1){
            FileWriter yaz = new FileWriter("edaFulinYilmaz.txt", false);
            yaz.write(hafiza.toString());
            yaz.close();
            System.out.println("Veriler silindi, ana menüye yönlendirildiniz.");
            }else{
                System.out.println("Böyle bir ID yok, Ana menüye yönlendirildiniz.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static String urunLinkiSilme(String [] ozellikler) {
        String satir = ozellikler[0] + ";" + ozellikler[1] + ";" + ozellikler[2] + ";" + 
                       ozellikler[3] + ";" + null + ";" + ozellikler[5];
        return satir;        
    }

    public static void urunYazdir (String[] ozellikler){
        System.out.println("id: " + ozellikler[0]);
        System.out.println("marka: " + ozellikler[1]);
        System.out.println("ürün ismi: " + ozellikler[2]);
        System.out.println("fiyat: " + ozellikler[3] + "$");
        System.out.println("link: " + ozellikler[4]);
        System.out.println("tür: " + ozellikler[5]);
        System.out.println("**********");
    }
}
    

